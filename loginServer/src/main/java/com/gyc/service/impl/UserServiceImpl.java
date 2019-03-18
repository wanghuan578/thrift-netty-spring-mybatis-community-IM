package com.gyc.service.impl;

import com.gyc.entity.UserInfoDmo;
import com.gyc.mapper.UserMapper;
import com.gyc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public UserInfoDmo selectByPrimaryKey(Long key) {

        return userMapper.selectByPrimaryKey(key);
    }
}
