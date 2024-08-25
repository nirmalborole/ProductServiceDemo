package com.example.apidemo.representing_Inheritance.table_per_class;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    private long id;
    private String name;
    private String emial;
    private String password;
}
