package com.gyc.mapper;


import org.springframework.stereotype.Repository;

import com.gyc.entity.UserInfoDmo;



@Repository
public interface UserMapper {

    UserInfoDmo selectByPrimaryKey(Long key);
}