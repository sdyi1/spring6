package com.nanhang;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/11/29
 * @ClassName ${NAME}
 */
public class Main {
    public static void main(String[] args) {
        String a = "NewYearFccXMX";
        //测试charAt方法：获取字符串中指定位置的字符
        char c = a.charAt(1);
        //测试substring方法：获取字符串中指定位置的子串
            /*方法一 ：一个参数  从指定索引开始截取到字符串末尾*/
        String substring = a.substring(3);
            /*方法二 ：两个参数  从指定索引开始截取到指定索引结束*/
        String substring1 = a.substring(3, 7);
        System.out.println(c);
        System.out.println(substring);
         System.out.println(substring1);



    }
}