package com.nanhang.Study02.Bean;

import org.springframework.stereotype.Repository;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/12
 * @ClassName Vip
 */
@Repository//注解的Value可以省略，省略后，默认的value就是类名的首字母小写
public class Vip {
    /*就好比在配置文件中写了
    * <bean id="vip" class="com.nanhang.Study02.Bean.Vip"/>
    * */
}
