package com.nanhang.Bean.Study04;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/14
 * @ClassName Person
 */
public class Person {

    public Person() {
        System.out.println("person的无参构造执行了");
    }

    /*@Target:判断创建的是不是Person对象，能不能调用对象方法*/
    public void Say(){
        System.out.println("创建的确实是Person对象");
    }
}
