package com.example.apidemo.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SampleController {

    @GetMapping("/sayHello")
    public  String sayHello(){
        return "Hello, everyone!";
    }

    @GetMapping("/sayBye/{name}")
    public String sayBye(@PathVariable("name") String name){
        return "Bye, "+ name;
    }

}
