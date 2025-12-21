package com.nanhang.Study04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/13
 * @ClassName user4
 */
@Component("user4")
public class user4 {
    @Value("张三")
    private String name;
    @Value("20")
    private int age;

    /*public user4(@Value("李四") String name, @Value("20") int age) {
        this.name = name;
        this.age = age;
    }*/

/*    @Value("王五")
    public void setName(String name) {
        this.name = name;
    }
    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }*/

    @Override
    public String toString() {
        return "user4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
