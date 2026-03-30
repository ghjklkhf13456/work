package com.HJh.test.oop.jiekou.jiekoulianxi;

public class LanQiuJ extends JiaoLian{
    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    public LanQiuJ() {
    }

    public LanQiuJ(String name, int age) {
        super(name, age);
    }
}
