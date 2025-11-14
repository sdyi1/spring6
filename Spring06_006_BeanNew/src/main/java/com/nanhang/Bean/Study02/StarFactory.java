package com.nanhang.Bean.Study02;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/11
 * @ClassName StarFactory
 */
public class StarFactory {

    public static Star getStar(String star){

        if (star.equals("SatrMan")){
            return new StarM();
        } else if (star.equals("StarWoman")) {
            return new StarW();
        } else{
            throw new RuntimeException("无这种类型");

        }

    }
}
