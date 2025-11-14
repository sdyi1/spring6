package com.nanhang.Bean.Study01;

import javax.management.RuntimeErrorException;
import javax.management.RuntimeOperationsException;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/10
 * @ClassName Factory
 */
public class Factory {
    public static Weapon makeWeapon(String name){

            switch (name) {
                case "FIGHTER":
                    return new fighter();
                case "TANK":
                    return new Tank();
                case "PISTOL":
                    return new Pistol();
                default:
                    throw new RuntimeException("无");

            }
    }
}
