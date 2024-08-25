package com.example.apidemo.representing_Inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "dummy_user")
public class User {
    @Id
    private long id;
    private String username;
    private String password;
}
