package com.victor.springboot.di.app.springboot_di.services;

import com.victor.springboot.di.app.springboot_di.models.Product;
import com.victor.springboot.di.app.springboot_di.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository repository = new ProductRepository();
    public List<Product> findAll(){
        return repository.findAll().stream().map(p -> {
            Double priceImp = p.getPrice() * 1.12;
            Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
            p.setPrice(priceImp.longValue());
            return newProduct;
        }).collect(Collectors.toList());
        
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }
}
