package com.nanhang.Bean.set08;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/7
 * @ClassName UserService
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void inster(){
        userDao.inster();
    }
}
