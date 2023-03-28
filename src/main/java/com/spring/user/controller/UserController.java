package com.spring.user.controller;

import com.spring.user.entity.UserBo;
import com.spring.user.service.UserOperation;
import com.spring.user.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserOperation userOperation;

    @GetMapping(value = "/")
    public String welcomeMessage(){
        return "Hello I am a User Service";
    }

    @GetMapping(value = "/allUsers")
    public List<UserBo> getAllUsers(){
        return userOperation.getAllUsers();
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserBo userBo){
        userOperation.saveUserDetails(userBo);
    }

    @GetMapping("/{id}")
    public UserBo getUserById(@PathVariable("id") int id){
        return userOperation.getUserById(id);
    }

    @GetMapping("/userdepartment/{id}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable("id") int userId){
        return userOperation.getUserWithDeparment(userId);
    }
}
