package com.victor.springboot.di.app.springboot_di.controllers;

import org.springframework.web.bind.annotation.RestController;
import  com.victor.springboot.di.app.springboot_di.models.Product;
import com.victor.springboot.di.app.springboot_di.services.ProductService;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService service = new ProductService();

    @GetMapping
    public List<Product> list(){
       return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }
}
