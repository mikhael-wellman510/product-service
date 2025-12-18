package com.example.product_service.service;

import com.example.api_service.dto.ProductStore;
import com.example.api_service.service.ProductStoreService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

@DubboService
public class ProductStoreServiceImpl implements ProductStoreService {


    @Override
    public List<ProductStore> listProductStore() {

        List<ProductStore> data = List.of(new ProductStore(1L,"susu",12) , new ProductStore(2L,"beras" , 5));

        return data;
    }
}
