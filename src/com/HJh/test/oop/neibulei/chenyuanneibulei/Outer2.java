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
            //在内部类中，除了有自己的成员变量和方法，还隐藏着一个指向外部类对象的引用this
            System.out.println(Outer2.this.a);
        }
    }
}
