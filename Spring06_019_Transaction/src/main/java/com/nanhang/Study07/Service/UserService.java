package com.nanhang.Study07.Service;

import com.nanhang.Study07.Pojo.user;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/19
 * @ClassName UserService
 */
public interface UserService {
    void save(user user);
    user select(String actno);
}
