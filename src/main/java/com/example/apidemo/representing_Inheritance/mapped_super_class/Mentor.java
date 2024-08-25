package com.example.apidemo.representing_Inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_mentor")
public class Mentor extends  User{
    private String avg_rating;
    private String company;
}
