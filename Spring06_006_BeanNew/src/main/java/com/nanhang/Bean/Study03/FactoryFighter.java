package com.nanhang.Bean.Study03;

import com.nanhang.Bean.Study03.FactoryWeapon;
import com.nanhang.Bean.Study03.Fighter;
import com.nanhang.Bean.Study03.Weapon;

/**
 * @author 徐
 * @version 1.0
 * @target 具体工厂角色 FighterFactory
 * @date 2025/11/10
 * @ClassName FactoryFighter
 */
public class FactoryFighter extends FactoryWeapon {
    @Override
    public Weapon getWea() {
        return new Fighter();
    }
}
