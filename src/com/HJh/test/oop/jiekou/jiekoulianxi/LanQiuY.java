package com.HJh.test.oop.jiekou.jiekoulianxi;

public class LanQiuY extends YunDongYuan{
    @Override
    public void study() {
        System.out.println("学习篮球");
    }

    public LanQiuY() {
    }

    public LanQiuY(String name, int age) {
        super(name, age);
    }
}
