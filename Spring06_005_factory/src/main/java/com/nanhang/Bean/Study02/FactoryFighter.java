package com.nanhang.Bean.Study02;

/**
 * @author 徐
 * @version 1.0
 * @target 具体工厂角色 FighterFactory
 * @date 2025/11/10
 * @ClassName FactoryFighter
 */
public class FactoryFighter extends FactoryWeapon{
    @Override
    public Weapon getWea() {
        return new Fighter();
    }
}
