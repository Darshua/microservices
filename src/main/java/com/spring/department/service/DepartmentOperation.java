package com.spring.department.service;

import com.spring.department.entity.DepartmentBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class DepartmentOperation {
    DepartmentBo departmentBo;
    List<DepartmentBo> departmentBos = new ArrayList<>();
    public List<DepartmentBo> getAllDepartment() {
        return departmentBos;
    }

    public void saveDepartmentData(DepartmentBo departmentBo){
        departmentBos.add(departmentBo);
    }

    public DepartmentBo getDepartmentById(int id){
       if(departmentBos.stream().anyMatch(d-> d.getDepartmentId() == (id)))
            return departmentBos.stream().filter(d-> d.getDepartmentId() == (id)).collect(Collectors.toList()).get(0);
       else return null;
    }

}
