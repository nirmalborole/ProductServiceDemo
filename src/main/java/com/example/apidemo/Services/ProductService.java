package com.example.apidemo.Services;

import com.example.apidemo.models.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);

    public List<Product> getAllProducts();

    public Product createProduct(String title,double price,String description,String image, String categoryName);

    public  Product updatePrice(long productId, double updatePrice);

    public  Product updateImage(long productId, String  updatedImage);

    public  boolean deleteProduct();
}
