package com.HJh.test.oop.duotaiyongfa.jichu;

public class Student extends  Person{
    @Override
    public void work() {
        super.work();
        System.out.println("学生工作是学习");
    }

    public Student() {
    }

    public Student(String name, String userName, String password) {
        super(name, userName, password);
    }
}
