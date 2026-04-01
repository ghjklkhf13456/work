package com.HJh.test.oop.neibulei.jingtaineibulei;

public class Outer {
    int a = 10;
    static int b = 20;


    static class Inner{
        public void show(){
            //System.out.println(a);a不是静态成员变量，不能访问
            Outer o=new Outer();
            System.out.println(o.a);//创建对象后才能访问
            System.out.println(b);
        }
    }
}
