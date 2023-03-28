package com.spring.department.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@EntityScan
public class DepartmentBo {
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentPlace() {
        return departmentPlace;
    }

    public void setDepartmentPlace(String departmentPlace) {
        this.departmentPlace = departmentPlace;
    }
    @NonNull
    Integer departmentId;
    String departmentName;
    String departmentPlace;
}
