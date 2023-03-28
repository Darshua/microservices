package com.spring.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackClass {
    @GetMapping(value ="/userServiceFallback")
    public String fallBackUserMethod(){
        return "user service is taking longer than expected." +
                "Please try again later";
    }

    @GetMapping(value ="/departmentServiceFallback")
    public String fallBackDepartmentMethod(){
        return "Department service is taking longer than expected." +
                "Please try again later";
    }
}
