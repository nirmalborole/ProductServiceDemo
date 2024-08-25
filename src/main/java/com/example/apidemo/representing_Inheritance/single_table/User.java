package com.example.apidemo.representing_Inheritance.single_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance
@Entity(name = "st_user")
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.INTEGER
)
@DiscriminatorValue(value = "0")
public class User {
    @Id
    private long id;
    private String name;
    private String emial;
    private String password;
}
