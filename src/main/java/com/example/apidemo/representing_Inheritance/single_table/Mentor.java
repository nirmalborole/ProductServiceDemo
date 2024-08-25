package com.example.apidemo.representing_Inheritance.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value ="2")
public class Mentor extends User {
    private String avg_rating;
    private String company;
}
