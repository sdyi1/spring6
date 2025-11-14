package com.nanhang;

import com.nanhang.Bean.Study01.Factory;
import com.nanhang.Bean.Study01.Weapon;
import com.nanhang.Bean.Study02.FactoryFighter;
import com.nanhang.Bean.Study02.FactoryGun;
import com.nanhang.Bean.Study02.FactoryWeapon;
import org.junit.Test;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/10
 * @ClassName test1
 */
public class test1 {

    /*测试简单工厂模式*/
    @Test
    public void study01Test(){


        Weapon tank = Factory.makeWeapon("TANK");
        tank.canDo();
        Weapon pistol = Factory.makeWeapon("PISTOL");
        pistol.canDo();
        Weapon fighter = Factory.makeWeapon("FIGHTER");
        fighter.canDo();
    }

    /*测试工厂方法模式*/
    @Test
    public void study02Test(){
        FactoryWeapon factoryWeapon = new FactoryFighter();
        factoryWeapon.getWea().canDo();
        FactoryWeapon factoryWeapon1= new FactoryGun();
        factoryWeapon1.getWea().canDo();
    }
}
