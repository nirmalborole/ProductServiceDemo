package com.example.apidemo.cardinalities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Tags {
    @Id
    private long id;
    private String name;
    private String number;
    private double price;
    @ManyToMany(mappedBy = "tags")
    private List<Laptop>laptops;
}
