package com.example.apidemo.cardinalities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Laptop {
    @Id
    private long id;
    private String name;
    private String model;
    private String number;
    @ManyToMany
    private List<Tags> tags;
}
