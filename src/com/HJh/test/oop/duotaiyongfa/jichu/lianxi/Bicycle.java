package com.HJh.test.oop.duotaiyongfa.jichu.lianxi;

public class Bicycle extends Vehicle{
    @Override
    public void move() {
        System.out.println("自行车"+getBrand()+"正在以"+getSpeed()+"km/h的速度移动");
    }
    public void ringBell(){
        System.out.println("铃~铃~铃~");
    }

    public Bicycle() {
    }

    public Bicycle(String brand, int speed) {
        super(brand, speed);
    }
}
