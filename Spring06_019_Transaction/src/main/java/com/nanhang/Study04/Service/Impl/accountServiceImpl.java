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
 * @date 2026/1/14
 * @ClassName accountServiceImpl
 */
@Service("accountService")
/*@Transactional*/
public class accountServiceImpl implements accountService {

    @Resource(name = "accountDaoImpl")
    private accountDao accountDao;
    @Override
    @Transactional
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
    /*测试方法，创建两个service 里面都有save方法，都设置事务的propagation
    save1方法中存入数据3，调用save2方法
    save2方法存入数据4
    *   在save2中添加异常，查看数据库，看看save1的数据是否存入
    如果没有存入，说明 REQUIRED 是save2加入了save1的事务，二者公用一个事务
    * */


    @Resource(name = "accountServiceImpl2")
    private accountService accountServiceImpl2;
    @Override
    //设置事务的propagation属性为REQUIRED
    @Transactional(propagation = Propagation.REQUIRED)

    public int save(user user) {
        com.nanhang.Study04.Pojo.user user1 = new user("act-003",1000.0);
        int save = accountDao.save(user1);
        //调用save2方法,存入 act004
        accountServiceImpl2.save(user);
        return 0;
    }
}
