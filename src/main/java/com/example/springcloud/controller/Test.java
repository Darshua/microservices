package com.example.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud")
public class Test {

    @Value(value = "${spring.application.name}")
    String name;

    @GetMapping("/check")
    public String testCo(){
        System.out.println(name);
        return name;
    }
}
