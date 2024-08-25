package com.example.apidemo.representing_Inheritance.joined_class;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_menter")
@PrimaryKeyJoinColumn(name = "user_id")
public class Mentor extends User {
    private String avg_rating;
    private String company;
}
