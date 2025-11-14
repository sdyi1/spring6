package com.nanhang.Bean.Study01;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/10
 * @ClassName fighter
 */
/*
 具体产品角色
 */
public class fighter extends Weapon{
  @Override
    public void canDo(){
        System.out.println("飞机可以释放小男孩");
    }
}
