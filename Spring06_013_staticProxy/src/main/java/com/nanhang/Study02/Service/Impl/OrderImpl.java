package com.nanhang.Study02.Service.Impl;

import com.nanhang.Study02.Service.OrderService;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/20
 * @ClassName OrderImpl
 */
/*
* 在项目已经正常运行了一年的时候
* 项目经理提出一个新的需求：要统计所有业务接口中每一个业务方法的耗时。
解决方法三：
* */
public class OrderImpl implements OrderService {
    /*
    * 根据 代理模式角色关系.png 的关系，我们称目标类里面的方法为目标方法，代理类里面的方法为代理方法。*/
    @Override
    public void generate() {
        //模拟程序等待时间
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单生成");
    }

    @Override
    public void modify() {
        //模拟程序等待时间
        try {
            Thread.sleep(225);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("订单修改");
    }

    @Override
    public void detail() {
        //模拟程序等待时间
        try {
            Thread.sleep(232);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("查看订单");
    }
}
