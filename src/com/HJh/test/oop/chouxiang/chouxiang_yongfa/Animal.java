package com.hjh.test.chouxiang.chouxiang_yongfa;

public abstract class Animal {
    protected String name;
    protected String color;
    public  void drink() {
        System.out.println("在喝水");
    }

    //定义抽象方法，用于在子类中重写
    public abstract void eat();




    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
