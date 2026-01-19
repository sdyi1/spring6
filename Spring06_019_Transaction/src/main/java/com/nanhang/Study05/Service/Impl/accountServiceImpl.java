package com.nanhang.Study05.Service.Impl;


import com.nanhang.Study05.Dao.accountDao;
import com.nanhang.Study05.Pojo.user;
import com.nanhang.Study05.Service.accountService;
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
    /*测试方法，创建两个service 里面都有save方法，save设置事务的propagation.REQUIRED_NEW
    save1方法中存入数据3，调用save2方法
    save2方法存入数据4
    *   在save2中添加异常，查看数据库，看看save1的数据是否存入
    如果成功，说明 REQUIRED_new  是新建了一个事务，save1和save2各自使用各自的事务，互不打扰

    注意:需要将 save2的异常在save1中 catch起来，否则save2中的异常会直接抛给save1，save1方法就会失败导致回滚
        catch起来的异常发生后，不会影响代码继续执行直到全部结束
        如果不catch起来，遇到异常，程序停止，后面的代码就不会执行，事务会回滚
    * */

    /*
     * 1测试没有异常的情况下添加 act-03和act-004 (结果：成功添加)
     * 2测试有异常但是不在save1中捕获的情况下添加 act-03和act-004  (结果：两个都添加失败)
     * 3测试有异常 并且在save1中捕获但是不抛出异常的情况下添加 act-03和act-004  (结果：act-03成功添加，act-04添加失败)
     * 4测试有异常 并且在save1中捕获并且抛出异常的情况下添加 act-03和act-004  (结果：两个都添加失败)
     * */
    @Resource(name = "accountServiceImpl2")
    private accountService accountServiceImpl2;
    @Override
    //设置事务的propagation属性为REQUIRED
    @Transactional(propagation = Propagation.REQUIRED)

    public int save(user user) {
        user user1 = new user("act-003",1000.0);
        accountDao.save(user1);
        //调用save2方法,存入 act004
        try {
            accountServiceImpl2.save(user);
        } catch (Exception e) {
            /*如果抛出异常：
            *   ave1方法会因为异常而中断执行，
            *   save1的事务会回滚，
            *   act_003 数据不会被保存到数据库
            *   后续代码不会执行
            * 如果不抛出异常，只是执行其他操作，或者不操作
            *   save1的事务会提交
            *   act_003 数据会被保存到数据库
            *   后续代码会继续执行
            * */
//            throw new RuntimeException("save1方法中捕获异常");
        }
        return 0;
    }
}
