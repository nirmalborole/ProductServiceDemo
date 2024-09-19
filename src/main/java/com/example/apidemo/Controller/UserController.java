package com.example.apidemo.Controller;

import com.example.apidemo.Services.UserService;
import com.example.apidemo.dtos.CreateUserRequestDto;
import com.example.apidemo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User  createUser(@RequestBody CreateUserRequestDto requestDto){
         return this.userService.CreateUser(requestDto.getName(),requestDto.getEmail(),requestDto.getPassword(),requestDto.getPhoneNumber());
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") long id){
        return this.userService.getUser(id);
    }

    @PatchMapping("/{id}/password")
    public User updatePassword(@PathVariable("id") long id, @RequestParam("password") String password){
        return userService.updatePassword(id, password);
    }

    @DeleteMapping("/{id}")
    public boolean deleateUser(@PathVariable("id") long id){
        return userService.deleateUser(id);
    }
}
