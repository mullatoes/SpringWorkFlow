package com.service.property.springworkflow.service;

import com.service.property.springworkflow.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {


    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    void updateUserName() {
        User user = new User();
        user.setId("1");
        user.setName("name");

        Assert.isTrue(userService.UpdateUserName("update"),"Update successful");
    }

    @Test
    void getUser() {
    }
}