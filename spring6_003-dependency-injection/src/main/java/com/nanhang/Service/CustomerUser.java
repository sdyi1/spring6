package com.nanhang.Service;

import com.nanhang.Dao.ConstomerDao;
import com.nanhang.Dao.UserDao;

/**
 * Bean
 * 实验构造注入
 * @author 徐
 * @version 1.0
 * @date 2025/10/28
 * @ClassName CustomerUser
 */
public class CustomerUser {
    private UserDao userDao;
    private ConstomerDao constomerDao;

    //创建全参构造
    public CustomerUser(UserDao userDao, ConstomerDao constomerDao) {
        this.userDao = userDao;
        this.constomerDao = constomerDao;
    }
}
