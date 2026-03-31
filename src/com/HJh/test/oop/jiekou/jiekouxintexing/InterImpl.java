package com.HJh.test.oop.jiekou.jiekouxintexing;

public class InterImpl implements InterA,InterB{

    @Override
    public void show1() {
        System.out.println("重写show1抽象方法");
    }

    @Override
    public void show2() {
        System.out.println("重写show2抽象方法");
    }


    //此时必须重写默认方法，因为实现类中存在多个接口，多个接口中存在相同名字的默认方法
    @Override
    public void function() {
        System.out.println("可以不重写默认方法");
    }
}
