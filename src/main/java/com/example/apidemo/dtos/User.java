package com.example.apidemo.dtos;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data

public class User {

    private String name;
    private String email;
    private String password;
    private List<Role> roles;
}
