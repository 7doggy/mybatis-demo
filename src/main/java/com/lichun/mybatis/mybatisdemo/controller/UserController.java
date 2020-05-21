package com.lichun.mybatis.mybatisdemo.controller;

import com.lichun.mybatis.mybatisdemo.entity.User;
import com.lichun.mybatis.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public User getUser() {
        return userService.getUser();
    }
}
