package com.example.apidemo.representing_Inheritance.joined_class;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Entity(name = "jt_user")
public class User {
    @Id
    private long id;
    private String name;
    private String emial;
    private String password;
}
