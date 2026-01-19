package com.nanhang.Study01.Service;

import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/8
 * @ClassName UserService
 */
@Service("userService")
public class UserService {
    public void transfer(){
        System.out.println("用户转账");
    }
    public void receivables(){
        System.out.println("用户收款");
    }
}
