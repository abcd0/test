package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    private AddService addService;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello SpringBoot!";
    }

    @RequestMapping("/add")
    public int add(@RequestParam("first") int a, @RequestParam("second") int b){
        return addService.add(a, b);
    }

    @RequestMapping("/getUser")
    public String getUser(@RequestBody User user){
        return user.getUsername() + user.getPassword();
    }
}
