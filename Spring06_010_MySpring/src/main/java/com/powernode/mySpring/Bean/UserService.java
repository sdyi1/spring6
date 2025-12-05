package com.powernode.mySpring.Bean;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/29
 * @ClassName UserService
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        userDao.inster();
    }
}
