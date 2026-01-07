package com.nanhang.Study03.Poxy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/7
 * @ClassName UserPoxy
 */
@Component
@Aspect
public class UserPoxy {
    @Before("com.nanhang.Study03.Poxy.PointcutExpression.pointcutExpression()")
    public void poxyText(){
        System.out.println("增强代码执行");
    }
}
