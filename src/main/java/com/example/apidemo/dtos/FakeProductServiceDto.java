package com.example.apidemo.dtos;

import com.example.apidemo.models.Category;
import lombok.Data;

@Data
public class FakeProductServiceDto {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
