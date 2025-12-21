package com.nanhang.test;

import com.nanhang.Study01.Service.Impl.OrderImplExt;
import com.nanhang.Study02.Service.Impl.OrderImpl;
import com.nanhang.Study02.Service.OrderService;
import com.nanhang.Study02.proxy.OrderServiceProxy;
import org.junit.Test;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/20
 * @ClassName Test01
 */
public class Test01 {
    @Test
    public void test02(){
        //首先实例化目标类
        OrderService tage = new OrderImpl();
        //将目标传输给代理类，给代理类里面的属性赋值
        OrderService proxy = new OrderServiceProxy(tage);
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
    @Test
    public void test01(){
        OrderImplExt orderImplExt = new OrderImplExt();
        orderImplExt.generate();
        orderImplExt.modify();
        orderImplExt.detail();
    }
}
