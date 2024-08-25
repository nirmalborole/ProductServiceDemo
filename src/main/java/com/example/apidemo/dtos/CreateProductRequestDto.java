package com.example.apidemo.dtos;

import lombok.Data;

@Data
public class CreateProductRequestDto {
    private String image;
    private String description;
    private String title;
    private double price;
    private String categoryName;
}
