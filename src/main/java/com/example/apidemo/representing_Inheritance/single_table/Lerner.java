package com.example.apidemo.representing_Inheritance.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "1")
public class Lerner extends User {
    private  String college;
    private String company;
}
