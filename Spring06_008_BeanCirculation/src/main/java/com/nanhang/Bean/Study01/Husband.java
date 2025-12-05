package com.nanhang.Bean.Study01;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/24
 * @ClassName Husband
 */
public class Husband {
    private String name;
    private Wife wife;

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    @Override
    public String
    toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
