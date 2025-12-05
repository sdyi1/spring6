package com.nanhang.Bean.Study03;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/29
 * @ClassName User2
 */
public class User2 {

    public User2() {
    }

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
