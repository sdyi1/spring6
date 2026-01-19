package com.nanhang.Study01.Service.Impl;

/**
 * @author 徐
 * @version 1.0
 * @target
 * @date 2025/12/20
 * @ClassName OrderImplExt
 */
public class OrderImplExt extends OrderImpl{
    /*解决方案二：编写业务类的子类，让子类继承业务类，对每个业务方法进行重写。*/
    @Override
    public void detail() {
        /*返回自 1970 年 1 月 1 日 00:00:00 GMT（称为 Unix 纪元）以来的当前时间（以毫秒为单位）*/
        long start = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start)+"毫秒");
    }

    @Override
    public void modify() {
        long start = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "毫秒");
    }
    @Override
    public void generate() {
        long start = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + "毫秒");
    }
}
