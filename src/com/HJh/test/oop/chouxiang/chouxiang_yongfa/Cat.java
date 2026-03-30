package com.HJh.test.oop.chouxiang.chouxiang_yongfa;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("在吃鱼");
    }
    public void catchMouse() {
        System.out.println("在抓老鼠");
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
    }
}
