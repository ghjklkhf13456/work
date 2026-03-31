package com.HJh.test.oop.jiekou.jiekouxintexing;

public interface InterA {
    public abstract void show1();
    public abstract void show2();

    //新增默认方法
    public default void function(){
        System.out.println("接口中新增默认方法");
    }
}
