package com.user.controller;

import com.user.entity.User;
import com.user.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    userService us;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        return us.getUser(userId);
    }

}
