package com.HJh.test.oop.jihe.baozhuanglei;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        /*需求：定义一个集合，添加一些学生对象
        学生类的属性为：id，姓名，年龄。
        要求：
        1.遍历集合，将所有学生的属性打印在控制台上，每个学生一行
        2．定义一个方法，根据id查找学生的信息。
        存在：返回索引
        不存在：返回-1*/
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("01","张三",18);
        Student s2 = new Student("02","李四",19);
        Student s3 = new Student("03","王五",20);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id：");
        String id = sc.next();
        System.out.println(findStudent(id,list));


    }
    public static int findStudent(String id,ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            //此时找到了集合中的元素，因为是Student类，所以用Student接受变量
            Student s = list.get(i);
            //s.getId()找到集合中元素Student类中的id属性，获取id属性的值与参数id比较
            if(s.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
