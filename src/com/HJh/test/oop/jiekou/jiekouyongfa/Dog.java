package com.HJh.test.oop.jiekou.jiekouyongfa;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

}
