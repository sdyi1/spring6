package com.nanhang.Bean.Set3;

/**
 * @author 徐
 * @version 1.0
 * @target 测试级联set注入
 * @date 2025/11/3
 * @ClassName Student
 */
public class Student {
    private String Name;
    private Clazz clazz;

    public void setName(String name) {
        Name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
