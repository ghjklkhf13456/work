package com.HJh.test.oop.duotaiyongfa.jichu.lianxi;

public class Test {
    public static void main(String[] args) {
        /*自行车Bicycle:
        属性：品牌，行驶速度
        行为：移动move，响铃ringBell
        汽车Car:
        属性：品牌，行驶速度
        行为：移动move，鸣笛honk
        人Person:
        属性：名字，年龄，性别
        行为：行驶交通工具（能使用所有交通工具）
        测试类中创建Person的对象，让这个使用任意一款交通工具*/

        Person p = new Person("张三", 18, "男");
        System.out.println("姓名"+p.getName()+"年龄"+p.getAge()+"性别"+p.getSex());
        Bicycle b = new Bicycle("凤凰", 10);
        p.drive(b);
        Car c = new Car("保时捷", 200);
        p.drive(c);
    }
}
