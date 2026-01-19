package com.nanhang.Study04.Service;

import com.nanhang.Study04.Pojo.user;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/14
 * @ClassName accountService
 */
public interface accountService {
    //转账方法
    void transfer(String fromCount, String toCount, Double money);
    int save(user user);
}
