package com.example.producingwebservice.dto;

import lombok.Data;

@Data
public class MappingDvcDto {
    private Long stt;
    private String dvcColumn;
    private String valueDvcColumn;
    private String dkxColumn;
    private String valueDkxColumn;
    private String status;

    private HoSoDvcBieuMauDto dvc;
    private MotoPortalDto dkx;
}
