package com.lichun.mybatis.mybatisdemo.mapper;

import com.lichun.mybatis.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMaper {
    User getUser();
}
