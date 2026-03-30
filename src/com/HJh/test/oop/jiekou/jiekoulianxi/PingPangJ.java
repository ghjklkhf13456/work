package com.HJh.test.oop.jiekou.jiekoulianxi;

public class PingPangJ extends JiaoLian implements English{
    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }

    @Override
    public void speak() {
        System.out.println("教练说英语");
    }

    public PingPangJ() {
    }

    public PingPangJ(String name, int age) {
        super(name, age);
    }
}
