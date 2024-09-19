package com.example.apidemo.representing_Inheritance.table_per_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tpc_ta")
public class TA extends UserDemo {
    private String lecture_solve;
    private String company;
}
