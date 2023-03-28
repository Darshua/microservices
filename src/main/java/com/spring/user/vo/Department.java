package com.spring.user.vo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@EntityScan
public class Department {
    @NonNull
    Integer departmentId;

    @NonNull
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(@NonNull Integer departmentId) {
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

    String departmentName;
    String departmentPlace;
}
