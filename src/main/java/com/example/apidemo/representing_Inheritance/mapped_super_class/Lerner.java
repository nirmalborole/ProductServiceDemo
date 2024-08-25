package com.example.apidemo.representing_Inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_lerner")
public class Lerner extends User{
    private  String college;
    private String company;
}
