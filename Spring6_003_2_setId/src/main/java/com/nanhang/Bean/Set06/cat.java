package com.nanhang.Bean.Set06;

/**
 * @author 徐
 * @version 1.0
 * @target 实验注入Null和空字符串
 * @date 2025/11/5
 * @ClassName cat
 */
public class cat {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
