package com.nanhang.Bean;

import java.util.Date;

/**
 * @target set注入————测试有哪些简单数据类型
 * @author 徐
 * @date 2025/10/30
 * @ClassName User2
 * @version 1.0
 */public class User2 {

     private String name;
     private int age;
     private Integer age2;
     private boolean choose;
     private Boolean choose2;
     private char c;
     private Character c2;
     private Season season;
     private Class aClass;
     private Date birth;

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }

    public void setChoose(boolean choose) {
        this.choose = choose;
    }

    public void setChoose2(Boolean choose2) {
        this.choose2 = choose2;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setC2(Character c2) {
        this.c2 = c2;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", age2=" + age2 +
                ", choose=" + choose +
                ", choose2=" + choose2 +
                ", c=" + c +
                ", c2=" + c2 +
                ", season=" + season +
                ", aClass=" + aClass +
                ", birth=" + birth +
                '}';
    }
}
