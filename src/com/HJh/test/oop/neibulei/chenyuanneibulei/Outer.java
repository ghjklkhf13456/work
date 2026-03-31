package com.HJh.test.oop.neibulei.chenyuanneibulei;
//成员内部类
public class Outer {
    String name;
    private class Inner{
        //由于我的版本是大于16的，所以可以定义静态成员变量
        static int a = 10;
    }

    //由于内部类Inner是private的，需要编写方法获取内部类对象
    public Inner getInner(){
        return new Inner();
    }


}
