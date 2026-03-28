package com.HJh.test.oop.duotaiyongfa.jichu.lianxi;

public class Person {
    private String name;
    private int age;
    private String sex;
    //行为：行驶交通工具
    public void drive(Vehicle vehicle){
        vehicle.move();
        if(vehicle instanceof Bicycle){
            Bicycle bicycle = (Bicycle)vehicle;
            bicycle.ringBell();
        }else if(vehicle instanceof Car){
            Car car = (Car)vehicle;
            car.honk();
        }else{
            System.out.println("无此交通工具");
        }
    }




    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
