package com.HJh.test.oop.duotaiyongfa.jichu;

public class Admin extends  Person{
    @Override
    public void work() {
        super.work();
        System.out.println("管理员的工作是管理");

    }

    public Admin() {
    }

    public Admin(String name, String userName, String password) {
        super(name, userName, password);
    }
}
