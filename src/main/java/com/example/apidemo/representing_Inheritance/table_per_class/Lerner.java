package com.example.apidemo.representing_Inheritance.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_lerner")
public class Lerner extends User {
    private  String college;
    private String company;
}
