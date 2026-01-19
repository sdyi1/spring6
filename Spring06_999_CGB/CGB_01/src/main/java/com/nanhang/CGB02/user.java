package com.nanhang.CGB02;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/13
 * @ClassName user
 */
public class user {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
