package com.example.apidemo.representing_Inheritance.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "3")
public class TA extends User {
    private String lecture_solve;
    private String company;
}
