package com.nanhang.Study01.Proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/8
 * @ClassName UserProxy
 */
@Component
@Aspect
public class UserProxy {
    @Around("com.nanhang.Study01.Proxy.PointcutExpressions.pointcutExpressions.pointcut()")
    public void test(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("记录用户名");
            joinPoint.proceed();
            System.out.println("记录用户名");
        } catch (Throwable e) {
            System.out.println("回滚事务");
        }
    }
}
