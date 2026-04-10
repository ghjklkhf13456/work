package com.HJh.test.oop.zifuchuan.stringbuilderyongfa;
//StringBuilder的构造方法:
//public StringBuilder()            空参构造    创建容器时，容器为空
//public StringBuilder(String str)  带参构造    创建容器时，容器为str

//StringBuilder的常见成员方法：
//  append（任意类型）  添加数据
//  reverse()         反转
//  int length()      获取长度
//  toString()          变回字符串
public class test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2.length());
        sb2.append("def");
        System.out.println(sb2);
        sb2.reverse();
        System.out.println(sb2);
        String result = sb2.toString();
        System.out.println(result.length());
    }
}
