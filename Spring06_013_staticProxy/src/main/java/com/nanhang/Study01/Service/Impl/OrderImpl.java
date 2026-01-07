package com.nanhang.Study01.Service.Impl;

import com.nanhang.Study01.Service.OrderService;

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
解决方案一：硬编码，在每一个业务接口中的每一个业务方法中直接添加统计耗时的程序。
这种方案的缺点：
缺点一：违背OCP开闭原则。
缺点二：代码没有得到复用。（相同的代码写了很多遍。）
*
解决方案二：编写业务类的子类，让子类继承业务类，对每个业务方法进行重写。
缺点一：虽然解决了OCP开闭原则。但是这种方式会导致耦合度很高，因为采用了继承关系。继承关系是一种耦合度非常高的关系，不建议使用。
缺点二：代码没有得到复用。（相同的代码写了很多遍。）*/
public class OrderImpl implements OrderService {
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
