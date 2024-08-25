package com.example.apidemo.Controller;

import com.example.apidemo.Services.ProductService;
import com.example.apidemo.dtos.CreateProductRequestDto;
import com.example.apidemo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("selfProduct") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
        return productService.getProductById(id);
    }

    public List<Product> getProducts(){
        return new ArrayList<Product>();
    }


    @PostMapping("")
    public  Product createProduct(@RequestBody CreateProductRequestDto requestDto){
        return productService.createProduct(requestDto.getTitle(), requestDto.getPrice(), requestDto.getDescription(), requestDto.getImage(), requestDto.getCategoryName());


    }
}
