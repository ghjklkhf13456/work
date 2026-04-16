package com.HJh.test.ZuoYeTest.application;

public class Test {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1,2);
        Complex complex2 = new Complex(3,4);
        System.out.println(complex1);
        System.out.println(complex2);
        complex1.complexAdd(complex2);
    }
}
