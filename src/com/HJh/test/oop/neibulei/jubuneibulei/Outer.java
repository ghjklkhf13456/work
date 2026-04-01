package com.HJh.test.oop.neibulei.jubuneibulei;

public class Outer {
    //外部类成员变量
    int size=1;

    public void show(){
        //局部变量
        int a = 10;
        class Inner{
            //内部类成员变量
            int age = 20;
            public void show1(){
                System.out.println(size);
                System.out.println(a);
                System.out.println("局部内部类中的show1方法");
            }
            public static void show2(){
                System.out.println("局部内部类中的show2静态方法");
            }
        }

        //创建局部内部类对象
        Inner i = new Inner();
        System.out.println(i.age);
        i.show1();
        Inner.show2();
    }
}
