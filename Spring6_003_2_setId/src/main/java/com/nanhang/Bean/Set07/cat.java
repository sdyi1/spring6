package com.nanhang.Bean.Set07;

/**
 * @author 徐
 * @version 1.0
 * @target 测试p命名空间注入 和 c命名空间注入
 * @date 2025/11/5
 * @ClassName cat
 */
public class cat {
    private String name;
    private Integer age;
    private animals animals;

    public cat() {
    }

    public cat(String name, Integer age, animals animals) {
        this.name = name;
        this.age = age;
        this.animals = animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAnimals(animals animals) {
        this.animals = animals;
    }
    @Override
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animals=" + animals +
                '}';
    }
}
