package com.spring.boot.demo.controller;

import com.spring.boot.demo.model.Product;
import com.spring.boot.demo.repository.springdatajpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @PostMapping("/product")
    public Product product(@RequestBody Product product){
        Product p = productRepository.save(product);
        return p;
    }

    @GetMapping("/product")
    public Iterable<Product> products(){
        return productRepository.findAll();
    }
}
