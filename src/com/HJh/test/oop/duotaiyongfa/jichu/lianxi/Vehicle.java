package com.HJh.test.oop.duotaiyongfa.jichu.lianxi;

public class Vehicle {
    private String brand;
    private int Speed;
    public void move(){
        System.out.println(brand+"正在以"+Speed+"km/h的速度移动");
    }

    public Vehicle() {
    }

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        Speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
}
