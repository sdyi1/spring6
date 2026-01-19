package com.nanhang;

import com.nanhang.Service.Time_MethodInterceptor;
import com.nanhang.Service.UserService;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2026/1/1
 * @ClassName Test01
 */
public class Test01 {
    @Test
public void Test01ByCglib(){
    //    创建字节码增强对象
//    这个对象是Cglib的核心对象，依靠他生成代理对象
    Enhancer enhancer = new Enhancer();
//    告诉Cglib 代理类的父类是谁（目标类）
    enhancer.setSuperclass(UserService.class);
//    设置回调(方法返回值) (将方法拦截器放入)
    enhancer.setCallback(new Time_MethodInterceptor());
    //关键：设置构造期间不拦截以避免Java 9+的模块访问问题
        enhancer.setInterceptDuringConstruction(false);
//    创建代理对象
    /*这一步会 现在内存中创建代理对象字节码
    *         再将代理对象实例化，强转成父类（目标类）
    * */
      UserService userServicePoxy= (UserService) enhancer.create();
        Boolean username = userServicePoxy.login("username", "123");
        System.out.println(username);
        userServicePoxy.logout();
    }
}
