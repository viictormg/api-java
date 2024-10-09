package com.victor.springboot.di.app.springboot_di.repositories;

import com.victor.springboot.di.app.springboot_di.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "carro 1", 2000L),
                new Product(2L, "carro 3", 1700L),
                new Product(3L, "carro 4", 1800L),
                new Product(4L, "carro 5", 9000L)
                );
    }


    public List<Product> findAll(){
        return data;
    }

    public Product findById(Long id){
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);   
    }
}
