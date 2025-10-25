package com.nanhang.dao.Impl;

import com.nanhang.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void deleteById(Integer Id) {
        System.out.println("使用MySQL删除用户"+Id+"的数据");
    }
}
