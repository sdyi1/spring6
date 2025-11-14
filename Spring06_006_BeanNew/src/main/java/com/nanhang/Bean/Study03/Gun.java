package com.nanhang.Bean.Study03;

import com.nanhang.Bean.Study03.Weapon;

/**
 * @author 徐
 * @version 1.0
 * @target 具体产品角色 Fighter Gun
 * @date 2025/11/10
 * @ClassName Gun
 */
public class Gun extends Weapon {

    @Override
    public void canDo() {
        System.out.println("开枪");
    }
}
