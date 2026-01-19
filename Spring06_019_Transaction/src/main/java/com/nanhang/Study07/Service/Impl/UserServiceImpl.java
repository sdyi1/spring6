package com.nanhang.Study07.Service.Impl;

import com.nanhang.Study07.Dao.UserDao;
import com.nanhang.Study07.Pojo.user;
import com.nanhang.Study07.Service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/19
 * @ClassName UserServiceImpl
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDaoImpl")
    private UserDao userDao;
    @Override
    @Transactional
    public void save(user user) {
        try {
            //添加数据
            userDao.save(user);
            //等待20秒，这个时候事务还没有完成，数据还在内存中，没有提交到数据库
            //方便我们测试，如果设置隔离级别为 1 2 的区别
            //如果读取到了数据，就说明是从内存中读取到的，脏读
            //如果没有读取到，说明是读取数据库的数据
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public user select(String actno) {
        //在前面的那个事务没有完成的时候，我们查询，判断是否是脏读
        user user1 = userDao.select(actno);
        return user1;
    }
}
