package com.example.apidemo.Services;

import com.example.apidemo.models.User;
import com.example.apidemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User CreateUser(String name, String email, String password, String phone) {
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhoneNumber(phone);
        return userRepository.save(user);
    }

    @Override
    public boolean deleateUser(long id) {
        if(userRepository.existsById(id)) {
            userRepository.deleteById(id);
        }
        return true;
    }

    @Override
    public User getUser(long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User updatePassword(long id, String password) {
        User user= userRepository.getUserById(id);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
