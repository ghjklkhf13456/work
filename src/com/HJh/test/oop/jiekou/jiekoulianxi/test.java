package com.HJh.test.oop.jiekou.jiekoulianxi;

public class test {
    public static void main(String[] args) {
        /*乒乓球运动员：姓名，年龄，学打乒乓球，说英语
        篮球运动员： 姓名，年龄，学打篮球
        乒乓球教练： 姓名，年龄，教打乒乓球，说英语
        篮球教练：姓名，年龄，教打篮球*/
        PingPangY pingPangY = new PingPangY("张三", 18);
        PingPangJ pingPangJ = new PingPangJ("李四", 19);
        LanQiuY lanQiuY = new LanQiuY("王五", 20);
        LanQiuJ lanQiuJ = new LanQiuJ("赵六", 21);
        System.out.println(pingPangY.getName()+" "+pingPangY.getAge());
        pingPangY.study();
        pingPangY.speak();
        System.out.println();
        System.out.println(pingPangJ.getName()+" "+pingPangJ.getAge());
        pingPangJ.teach();
        pingPangJ.speak();
        System.out.println();
        System.out.println(lanQiuY.getName()+" "+lanQiuY.getAge());
        lanQiuY.study();
        System.out.println();
        System.out.println(lanQiuJ.getName()+" "+lanQiuJ.getAge());
        lanQiuJ.teach();





    }
}
