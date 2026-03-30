package com.HJh.test.oop.jiekou.jiekoulianxi;

public class PingPangY extends YunDongYuan implements English{
    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("远动员说英语");
    }

    public PingPangY() {
    }

    public PingPangY(String name, int age) {
        super(name, age);
    }
}
