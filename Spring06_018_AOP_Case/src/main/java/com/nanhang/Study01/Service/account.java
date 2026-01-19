package com.nanhang.Study01.Service;

import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/8
 * @ClassName account
 */
@Service("account")
public class account {
    public void login(){
        System.out.println("用户登录");
    }
    public void logout(){
        System.out.println("用户登出");
    }
}
