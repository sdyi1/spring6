package com.nanhang.Study02.proxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName UserProxy
 */
@Component
@Aspect
@Order(2)
public class UserProxy {
    @Before("com.nanhang.Study02.proxy.PointcutExpression.poincutExpression()")
    public void poxyTest(){
        System.out.println("切面1执行");
    }
}
