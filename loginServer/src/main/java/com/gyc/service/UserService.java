package com.gyc.service;



import java.util.List;

import com.gyc.entity.UserInfoDmo;

public interface UserService {
    /**
     * 获取所有数据
     * @return
     */
    UserInfoDmo selectByPrimaryKey(Long key);
}
