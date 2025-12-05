package com.nanhang.Bean.Study01;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/24
 * @ClassName Wife
 */
public class Wife {
    private String name;
    private Husband husband;

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
