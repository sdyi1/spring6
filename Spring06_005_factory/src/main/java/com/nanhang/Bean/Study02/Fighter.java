package com.nanhang.Bean.Study02;

/**
 * @author 徐
 * @version 1.0
 * @target *具体产品角色 Fighter
 * @date 2025/11/10
 * @ClassName Fighter
 */
public class Fighter extends Weapon{
    @Override
    public void canDo() {
        System.out.println("投掷小男孩");
    }
}
