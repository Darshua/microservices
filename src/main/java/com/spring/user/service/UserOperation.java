package com.spring.user.service;

import com.spring.user.entity.UserBo;
import com.spring.user.vo.Department;
import com.spring.user.vo.ResponseTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserOperation {
   @Autowired
    RestTemplate restTemplate;
    List<UserBo> userList = new ArrayList<>();
    public List<UserBo> getAllUsers() {
        return userList;
    }

    public void saveUserDetails(UserBo userBo) {
        userList.add(userBo);
    }

    public UserBo getUserById(int id) {
        return userList.stream().filter(j-> j.getUserId() == id).collect(Collectors.toList()).get(0);
    }

    public ResponseTemplateVo getUserWithDeparment(int userId) {
        ResponseTemplateVo responseTemplateVo = new ResponseTemplateVo();
        UserBo userBo = getUserById(userId);
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+userId, Department.class);
        responseTemplateVo.setUserBo(userBo);
        responseTemplateVo.setDepartment(department);
        return responseTemplateVo;
    }
}
