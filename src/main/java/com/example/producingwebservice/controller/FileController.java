package com.example.producingwebservice.controller;

import com.example.producingwebservice.dto.MappingDvcDto;
import com.example.producingwebservice.service.FileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FileController {
    @Autowired
    FileService fileService;


    @PostMapping("/check-file")
    public ResponseEntity<byte[]> checkMapDvcOnlinePath2(@RequestPart("file") MultipartFile file,
                                                         @RequestPart("dto") MappingDvcDto dto) {
        return fileService.checkMapDvcOnline(dto, file);
    }
}