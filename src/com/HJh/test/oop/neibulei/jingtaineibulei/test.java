package com.HJh.test.oop.neibulei.jingtaineibulei;
//静态内部类:也就是内部类加上static修饰

//注意事项：
//        1.静态内部类也是成员内部类中的一种
//        2.静态内部类只能访问外部类中的静态变量和静态方法，
//              如果想要访问非静态的需要创建对象。

//        创建静态内部类对象的格式：
//              外部类名.内部类名 对象名=new 外部类名.内部类名();
//        调用静态方法的格式：
//              外部类名.内部类名.方法名();
public class test {
    public static void main(String[] args) {
        //创建静态内部类对象
        //只要是静态的东西，都可以用类名点直接获取
        Outer2.Inner oi = new Outer2.Inner();
        oi.show1();
        //静态方法
        Outer2.Inner.show2();

    }
}
