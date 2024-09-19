package com.example.apidemo.dtos;

import lombok.Data;

@Data
public class CreateUserRequestDto {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
}
