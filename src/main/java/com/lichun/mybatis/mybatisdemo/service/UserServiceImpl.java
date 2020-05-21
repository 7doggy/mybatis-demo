package com.lichun.mybatis.mybatisdemo.service;

import com.lichun.mybatis.mybatisdemo.entity.User;
import com.lichun.mybatis.mybatisdemo.mapper.UserMaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMaper userMaper;


    @Override
    public User getUser() {
        return userMaper.getUser();
    }
}
