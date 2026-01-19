package com.nanhang.Study02.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName UserProxy2
 */
@Component
@Aspect
@Order(1)
public class UserProxy2 {

    @Before("com.nanhang.Study02.proxy.PointcutExpression.poincutExpression()")
    public void textpoxy2(JoinPoint joinPoint){
        System.out.println("切面2执行");
        //获取目标方法签名
        Signature signature = joinPoint.getSignature();
        //签名可以用来获取目标方法的一些信息
        System.out.println("方法名: " + signature.getName());
        System.out.println("声明类型: " + signature.getDeclaringType());
        System.out.println("声明类型名: " + signature.getDeclaringTypeName());
        System.out.println("修饰符: " + signature.getModifiers());

    }
}
