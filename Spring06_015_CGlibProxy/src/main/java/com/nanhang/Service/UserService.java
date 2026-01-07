package com.nanhang.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/1
 * @ClassName UserService
 */
public class UserService {

    public Boolean login(String UserName, String Password){

        if(UserName.equals("username") && Password.equals(123)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("正在退出");
    }
}
