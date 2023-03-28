package com.spring.user.vo;

import com.spring.user.entity.UserBo;
import org.springframework.stereotype.Component;

@Component
public class ResponseTemplateVo {
    private UserBo userBo;

    public UserBo getUserBo() {
        return userBo;
    }

    public void setUserBo(UserBo userBo) {
        this.userBo = userBo;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;
}
