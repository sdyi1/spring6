package com.nanhang.Study05.powernode.impl;

import com.nanhang.Study05.powernode.orderDao;
import org.springframework.stereotype.Repository;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/17
 * @ClassName orderDaoImplBySql
 */
@Repository
public class orderDaoImplBySql implements orderDao {
    @Override
    public void inster() {
        System.out.println("MySql正在保存数据...");
    }
}
