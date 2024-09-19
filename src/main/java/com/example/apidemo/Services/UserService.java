package com.example.apidemo.Services;

import com.example.apidemo.models.User;

public interface UserService {
    public User CreateUser(String name, String email, String password, String phone);

    public boolean deleateUser(long id);

    public User getUser(long id);

    public User updatePassword(long id,String password);

}
