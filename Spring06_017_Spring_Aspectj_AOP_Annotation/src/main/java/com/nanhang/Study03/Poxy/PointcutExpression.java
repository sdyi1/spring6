package com.nanhang.Study03.Poxy;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName PointcutExpression
 */
public class PointcutExpression {
    @Pointcut("execution(public void com.nanhang.Study03.UserService.UserService.*(..))")
    public void pointcutExpression(){
        System.out.println("增强代码执行");
    }
}
