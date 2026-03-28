package com.HJh.test.oop.duotaiyongfa.jichu.lianxi;

public class Car extends  Vehicle{
    @Override
    public void move() {
        System.out.println("汽车"+getBrand()+"正在以"+getSpeed()+"km/h的速度移动");
    }
    public void honk(){
        System.out.println("叭~叭~叭~");
    }

    public Car() {
    }

    public Car(String brand, int speed) {
        super(brand, speed);
    }
}
