package com.HJh.test.oop.neibulei.jingtaineibulei;

public class Outer2 {
    int a = 10;
    static int b = 20;
    static class Inner{
        //非静态方法
        public void show1(){
            Outer2 o=new Outer2();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("非静态的方法被调用了");
        }
        //静态方法
        public static void show2(){
            Outer2 o=new Outer2();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("静态的方法被调用了");
        }
    }
}
