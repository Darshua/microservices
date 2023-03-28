package com.spring.department.controller;

import com.spring.department.entity.DepartmentBo;
import com.spring.department.service.DepartmentOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentOperation departmentOperation;

    @GetMapping(value = "/")
    public String welcomeMessage(){
       return "welcome to department Service";
    }
    @GetMapping(value = "/allDepartment")
    public List<DepartmentBo> getAllDepartment(){
        return departmentOperation.getAllDepartment();
    }

    @PostMapping(value = "/saveDepartment")
    public void saveDepartment(@RequestBody DepartmentBo departmentBo){
       departmentOperation.saveDepartmentData(departmentBo);
    }
    @GetMapping(value = "/{id}")
    public DepartmentBo getDepartmentById(@PathVariable("id") int departmentId){
        return departmentOperation.getDepartmentById(departmentId);
    }
}
