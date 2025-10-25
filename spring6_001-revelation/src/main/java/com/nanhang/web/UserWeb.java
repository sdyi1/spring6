package com.nanhang.web;

import com.nanhang.service.UserService;
import com.nanhang.service.impl.UserServiceIpml;

public class UserWeb {

    /**
     * 删除用户
     */
    public void deletById(Integer id){
        UserService userServiceIpml = new UserServiceIpml();
        userServiceIpml.deleteById(id);

    }
}
