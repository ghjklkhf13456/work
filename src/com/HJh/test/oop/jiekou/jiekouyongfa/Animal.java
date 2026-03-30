package com.HJh.test.oop.jiekou.jiekouyongfa;

public abstract class Animal {
    private String name;
    private String color;
    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
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
