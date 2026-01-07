package com.nanhang.Study03.UserService;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName UserService
 */
@Component("userService")

public class UserService {
    public void show(){
        System.out.println("目标方法执行");
    }
}
