package com.HJh.test.oop.neibulei.chenyuanneibulei;
//成员内部类
public class Outer2 {
    private int a = 10;
    class Inner{
        private int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer2.this.a);
        }
    }
}
