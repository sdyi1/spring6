package com.nanhang.Service;

import com.nanhang.Dao.UserDao;

/**
 * @author 徐
 * @version 1.0
 * @date 2025/10/27
 * @ClassName UserService
 */
public class UserService {

    //注意这里我们已经将new的权力交给spring
    private UserDao userDao;
    //写一个set方法实验set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void intoTest(){
     userDao.intoTest();
  }

}
