package com.HJh.test.oop.jichenyongfa.chongxie_tostring;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("小王",18,"男");
        //s1存储的是对象的地址，直接输出，默认会调用object类的toString方法，返回对象的地址
        //一般不想要看地址，而是想要看对象中的内容，所以重写toString方法
        System.out.println(s1);
    }
}
