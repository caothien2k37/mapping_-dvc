package com.example.producingwebservice.service;

import com.example.producingwebservice.dto.MappingDvcDto;
import com.opencsv.CSVWriter;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.*;


import javax.persistence.Column;

@Service
public class FileService {

    public ResponseEntity<byte[]> checkMapDvcOnline(MappingDvcDto dto, MultipartFile file ) {
        List<MappingDvcDto> mappingDvcDtoList = new ArrayList<>();
        byte[] bytes;
        try {
            StringWriter writer = new StringWriter();
            CSVWriter csvWriter = new CSVWriter(writer);
            var xss = new XSSFWorkbook(file.getInputStream());
            var sheet =  xss.getSheet("cap_doi");
            DataFormatter dataFormat = new DataFormatter();


            String[] header = { "STT", "COLUMN DVC", "DATA DVC",  "COLUMN MOTO PORTAL", "DATA MOTO PORTAL", "STATUS"};
            csvWriter.writeNext(header);
            for (Row row : sheet) {
                if (row.getRowNum() == 0 || row.getRowNum() == 1) {
                    continue;
                }
                for (Field nameColumnDvc : dto.getDvc().getClass().getDeclaredFields()) {
                    MappingDvcDto mappingDvcDto = new MappingDvcDto();
                    try {
                        nameColumnDvc.setAccessible(true);
                        String cotHoSoDvc = nameColumnDvc.getAnnotation(JsonProperty.class).value().toUpperCase();
                        if (dataFormat.formatCellValue(row.getCell(1)).toUpperCase().equals(cotHoSoDvc)) {
                            mappingDvcDto.setDvcColumn(cotHoSoDvc);
                            mappingDvcDto.setValueDvcColumn(nameColumnDvc.get(dto.getDvc()).toString());
                            for (Field nameColumnDkx : dto.getDkx().getClass().getDeclaredFields()) {
                                nameColumnDkx.setAccessible(true);
                                String cotMotoMap = nameColumnDkx.getAnnotation(Column.class).name().toUpperCase();
                                if (dataFormat.formatCellValue(row.getCell(3)).toUpperCase().equals(cotMotoMap)) {
                                    mappingDvcDto.setDkxColumn(cotMotoMap);
                                    mappingDvcDto.setValueDkxColumn(nameColumnDkx.get(dto.getDkx()).toString());
                                    mappingDvcDtoList.add(mappingDvcDto);
                                    mappingDvcDto.setStatus(mappingDvcDto.getValueDvcColumn().equals(mappingDvcDto.getValueDkxColumn()) ? "TRUE" : "FALSE");
                                    String[] data = {String.valueOf(row.getRowNum()),
                                            mappingDvcDto.getDvcColumn(),
                                            mappingDvcDto.getValueDvcColumn(),
                                            mappingDvcDto.getDkxColumn(),
                                            mappingDvcDto.getValueDkxColumn(),
                                            mappingDvcDto.getStatus()
                                    };
                                    csvWriter.writeNext(data);
                                }
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            csvWriter.close();
            bytes = writer.toString().getBytes(StandardCharsets.UTF_8);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_PLAIN);
        headers.setContentDispositionFormData("filename", "output.csv");
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }
}