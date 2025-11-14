package com.nanhang.Bean.Study01;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/10
 * @ClassName Tank
 */

/*
 具体产品角色
 */
public class Tank extends Weapon{
    @Override
    public void canDo(){
        System.out.println("坦克开炮");
    }
}
