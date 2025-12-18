package com.example.product_service.controller;

import com.example.api_service.service.BiodataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BiodataController {

    private final BiodataService biodataService;

    @GetMapping("/bio")
    public ResponseEntity<?>biodata(){

        var data = biodataService.getBio();

        return ResponseEntity.ok(data);
    }
}
