package com.spring.boot.demo.repository.springdatajpa;

import com.spring.boot.demo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
