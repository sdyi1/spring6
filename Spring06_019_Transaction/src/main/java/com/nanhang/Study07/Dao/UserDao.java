package com.nanhang.Study07.Dao;

import com.nanhang.Study07.Pojo.user;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/19
 * @ClassName UserDao
 */
public interface UserDao {
    void save(user user);
    user select(String userActno);
}
