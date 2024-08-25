package com.example.apidemo.representing_Inheritance.joined_class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_lerner")
@PrimaryKeyJoinColumn(name = "user_id")
public class Lerner extends User {
    private  String college;
    private String company;
}
