package com.example.apidemo.dtos;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Data
public class Token {

    private String value;
    private User user;
    private Date expireAt;
    private boolean isActive;

}
