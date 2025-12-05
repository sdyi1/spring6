package com.nanhang.Bean.Study02;

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

    public Wife(String name, Husband husband) {
        this.name = name;
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
