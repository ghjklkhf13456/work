package com.HJh.test.oop.jiekou.jiekouxintexing2;
//虚方法表
//  非static 非final 非private
//  只有虚方法表里面的方法才能够被重写，方法重写的实际意义就是替换了虚方法表中记录方法的内存地址
public class InterImpl implements  Inter{
//错误
//不能重写静态方法
        /*@Override
        public void show() {
            System.out.println("实现类重写接口中的静态方法");
        }*/


//正确
//此时相当于接口和实现类里面刚好有两个同名的方法而己，但是不构成重写关系
//    public static void show() {
//        System.out.println("这是InterImpl中的静态方法");
//    }

}
