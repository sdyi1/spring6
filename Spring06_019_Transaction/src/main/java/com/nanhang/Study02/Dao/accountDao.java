package com.nanhang.Study02.Dao;

import com.nanhang.Study02.Pojo.user;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/14
 * @ClassName accountDao
 */
public interface accountDao {
    user select(String actno);
    int update(user user);
}
