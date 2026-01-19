package com.nanhang.Study02.Service;

import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName UserService
 */
@Service("userService")
public class UserService {

    public void show(){
        System.out.println("目标类方法执行");
    }
}
