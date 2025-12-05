package com.nanhang.Bean.Study01;

/**
 * Bean生命周期按照五步划分
 * 第一步:实例化Bean(调用无参数构造方法。)
 * 第二步:给Bean属性赋值(调用set方法。)
 *第三步:初始化Bean(会调用Bean的init方法。注意:这个init方法需要自己写，自己配。)
 *第四步:使用Bean
 *第五步:销毁Bean(会调用Bean的dèstroy方法。注意:这个destroy方法需要自己写，自己配。)
 * @author 徐
 * @version 1.0
 * @target 测试Bean的五步
 * @date 2025/11/18
 * @ClassName User
 */
public class User {

    private String name;

    public User() {
        System.out.println("第一步，实例化Bean");
    }

    public void setName(String name) {
        System.out.println("第二部，给Bean赋值");
        this.name = name;
    }

    /*初始化Bean需要我们再配置文件种通过 init-method="方法名" 配置*/
    public void initBean (){
        System.out.println("第三步，初始化Bean");
    }
    /*销毁Bean需要我们再配置文件种通过 destroy-method="方法名" 配置*/
    public void deleteBean(){
        System.out.println("第五步，销毁Bean");
    }
}
