package com.secured.application.service;

import com.secured.application.Entity.Product;
import com.secured.application.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> findAll(){
        return productRepo.findAll();
    }

}
