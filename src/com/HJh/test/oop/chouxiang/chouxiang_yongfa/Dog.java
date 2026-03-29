package com.hjh.test.chouxiang.chouxiang_yongfa;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void lookHome() {
        System.out.println("狗在看家");
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public Dog() {
    }
}
