package com.spring.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/gateway")
public class UserController {

    @Value(value = "${name}")
    String name;

    @GetMapping(value = "/")
    public String welcomeMessage(){
        return name;
    }
}