package com.HJh.test.oop.jiekou.jiekouyongfa;

public class Frog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }

    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }
}
