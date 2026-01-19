package com.nanhang.Study01.Service.Impl;

import com.nanhang.Study01.Dao.accountDao;
import com.nanhang.Study01.Pojo.user;
import com.nanhang.Study01.Service.accountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/14
 * @ClassName accountServiceImpl
 */
@Service("accountService")
public class accountServiceImpl implements accountService {

    @Resource
    private accountDao accountDao;
    @Override
    public void transfer(String fromCount, String toCount, Double money) {
        //判断转账账户是否有足够的钱
            //根据账号查询
        user fromCountuser = accountDao.select(fromCount);
        user toCountuser = accountDao.select(toCount);
        if (fromCountuser.getBalance()<money){

            throw new RuntimeException("账号余额不足，无法转账");

        }
        //如果余额足够，修改两个账号的余额
            //转账账号减去金额
        fromCountuser.setBalance(fromCountuser.getBalance()-money);
            //收款账号添加余额
        toCountuser.setBalance(toCountuser.getBalance()+money);
            //修改数据库数据
        int update = accountDao.update(fromCountuser);
        //模拟添加异常
        String a = null;
        a.toString();
        int update1 = accountDao.update(toCountuser);

        if (update1+update!=2){
            throw new RuntimeException("转账失败，联系银行");
        }

    }
}
