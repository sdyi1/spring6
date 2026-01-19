package com.nanhang.Study05.Service;

import com.nanhang.Study05.powernode.orderDao;
import com.nanhang.Study05.powernode2.orderDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 徐
 * @version 1.0
 * @target:测试使用@Autowired注解注入对象,和当有多个实现类情况下@Autowired+@Qualifier注解注入对象
 * @date 2025/12/17
 * @ClassName orderService
 */
@Service
public class orderService {


    @Autowired
    @Qualifier("orderDaoImplByMySql")
    private orderDao2 orderDao;
    public void inster(){
        orderDao.inster();
    }

}
