package com.nanhang.Bean;

/**
 * @target 了解set注入 简单数据类型
 * @author 徐
 * @version 1.0
 * @date 2025/10/30
 * @ClassName User
 */
public class User {
    private String UserName;
    private String PassWord;
    private int age;

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                ", age=" + age +
                '}';
    }
}
