package com.example.apidemo.representing_Inheritance.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_ta")
public class TA extends  User{
    private String lecture_solve;
    private String company;
}
