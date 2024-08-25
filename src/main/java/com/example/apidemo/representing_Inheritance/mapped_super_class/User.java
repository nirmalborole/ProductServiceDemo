package com.example.apidemo.representing_Inheritance.mapped_super_class;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.context.annotation.Primary;
@Data
@MappedSuperclass
public class User {
    @Id
    private long id;
    private String name;
    private String emial;
    private String password;
}
