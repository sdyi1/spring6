package com.nanhang.Service;

import com.nanhang.Dao.OrderDao;

/**
 * @author 徐
 * @version 1.0
 * @date 2025/10/29
 * @ClassName OrderService
 */
public class OrderService {
    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void inster(){
        orderDao.inster();
    }
}
