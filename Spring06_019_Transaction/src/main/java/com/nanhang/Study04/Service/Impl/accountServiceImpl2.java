package com.nanhang.Study04.Service.Impl;

import com.nanhang.Study04.Dao.accountDao;
import com.nanhang.Study04.Pojo.user;
import com.nanhang.Study04.Service.accountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/16
 * @ClassName accountServiceImpl2
 */
@Service("accountServiceImpl2")
public class accountServiceImpl2 implements accountService {
    @Resource(name = "accountDaoImpl")
    private accountDao accountDaoImpl;
    @Override
    public void transfer(String fromCount, String toCount, Double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int save(user user) {
        int save = accountDaoImpl.save(user);
        //创建异常，看看发生异常，前面的保存数据会不会存入，如果不会，说明两个方法共用一个事务
        /*String a = null;
        a.toString();*/
        return save;
    }
}
