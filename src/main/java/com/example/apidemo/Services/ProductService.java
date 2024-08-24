package com.example.apidemo.Services;

import com.example.apidemo.models.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);

    public List<Product> getAllProducts();
}
