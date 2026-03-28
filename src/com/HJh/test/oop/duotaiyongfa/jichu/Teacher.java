package com.HJh.test.oop.duotaiyongfa.jichu;

public class Teacher extends  Person{
    @Override
    public void work() {
        super.work();
        System.out.println("老师的工作是教书");
    }

    public Teacher() {
    }

    public Teacher(String name, String userName, String password) {
        super(name, userName, password);
    }
}
