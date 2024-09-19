package com.example.apidemo.representing_Inheritance.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_menter")
public class Mentor extends UserDemo {
    private String avg_rating;
    private String company;
}
