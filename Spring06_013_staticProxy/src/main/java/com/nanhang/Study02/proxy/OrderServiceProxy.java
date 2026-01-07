package com.nanhang.Study02.proxy;

import com.nanhang.Study02.Service.OrderService;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/20
 * @ClassName OrderServiceProxy
 */
public class OrderServiceProxy implements OrderService {
    /*1将目标对象作为代理对象的一个属性。这种关系叫做关联关系。比继承关系的耦合度低。
        1代理对象中含有目标对象的引用。关联关系。
        注意：代理对象的属性是代理对象和目标对象的公共接口类型。因为公共接口耦合度低。
        我们需要哪个目标对象在创建代理对象的时候就实例化后直接传入，我们调用方法就是我们传入的哪个目标类的方法
        看不懂看Test02*/

    /*1符合开闭原则，没有修改原先代码
    * 2耦合度底，没有使用继承
    *
    * 缺点：我们这里使用的是静态代理，如果程序中有100个接口，我们就需要写100个代理类，类爆炸*/
    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void generate() {//代理方法
        long start = System.currentTimeMillis();
        orderService.generate();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "毫秒");

    }

    @Override
    public void modify() {
        long start = System.currentTimeMillis();
        orderService.modify();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "毫秒");
    }

    @Override
    public void detail() {
        long start = System.currentTimeMillis();
        orderService.detail();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "毫秒");
    }
}
