package com.nanhang.Bean.study02;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/19
 * @ClassName User2
 */
public class User2 {
    private String name;

    public User2() {
        System.out.println("第一步，实例化Bean");
    }

    public void setName(String name) {
        System.out.println("第二部，给Bean赋值");
        this.name = name;
    }

    /*初始化Bean需要我们再配置文件种通过 init-method="方法名" 配置*/
    public void initBean (){
        System.out.println("第四步，初始化Bean");
    }
    /*销毁Bean需要我们再配置文件种通过 destroy-method="方法名" 配置*/
    public void deleteBean(){
        System.out.println("第六步，销毁Bean");
    }
}
