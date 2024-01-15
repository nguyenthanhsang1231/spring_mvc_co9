package com.java.springmvcc09.service;

import com.java.springmvcc09.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> list;
    public ProductService() {
        this.list = new ArrayList<>();
        this.add(new Product(1, "A", 100));
        this.add(new Product(2, "B", 100));
    }
    public List<Product> findAll() {
        return list;
    }

    public void add(Product product) {
        list.add(product);
    }
}
