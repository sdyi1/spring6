package com.nanhang.Bean.Study03;

import com.nanhang.Bean.Study03.FactoryWeapon;
import com.nanhang.Bean.Study03.Gun;
import com.nanhang.Bean.Study03.Weapon;

/**
 * @author 徐
 * @version 1.0
 * @target具体工厂角色 GunFactory
 * @date 2025/11/10
 * @ClassName FactoryGun
 */
public class FactoryGun extends FactoryWeapon {
    @Override
    public Weapon getWea() {
        return new Gun();
    }
}
