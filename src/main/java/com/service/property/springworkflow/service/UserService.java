package com.service.property.springworkflow.service;

import com.service.property.springworkflow.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    public boolean UpdateUserName(String userName){
        User user = getUser();
        user.setName(userName);
        System.out.println("User name is updated: " + user.getName());
        return true;
    }

    public User getUser(){
        User user = new User();
        user.setId("1");
        user.setName("Paul");
        return user;
    }

}
