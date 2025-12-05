package com.nanhang.Bean.Study02;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/28
 * @ClassName UserBean
 */
public class UserBean {
    public void doSome(){
        System.out.println(" public void doSome()执行");
    }

    public String doSome(String string){
        System.out.println(" public String doSome(String string)执行");
        return string;
    }

    public  String doSome(String string,int i){
        System.out.println(" public String doSome(String string,int i)执行");
        return string+i;
    }


}
