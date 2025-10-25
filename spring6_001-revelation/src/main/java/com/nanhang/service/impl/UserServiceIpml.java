package com.nanhang.service.impl;

import com.nanhang.dao.Impl.UserDaoImpl;
import com.nanhang.dao.UserDao;
import com.nanhang.service.UserService;

public class UserServiceIpml implements UserService {


    @Override
    public void deleteById(Integer id) {
        UserDao userDao = new UserDaoImpl();
        userDao.deleteById(1);

    }
}
