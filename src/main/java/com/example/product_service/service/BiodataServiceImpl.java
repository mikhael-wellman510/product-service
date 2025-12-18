package com.example.product_service.service;

import com.example.api_service.dto.Biodata;
import com.example.api_service.service.BiodataService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class BiodataServiceImpl implements BiodataService {

    @Override
    public Biodata getBio() {
        return Biodata.builder()
                .name("Mike")
                .age(7)
                .build();
    }
}
