package com.HJh.test.oop.duotaiyongfa.jichu;

public class SystemManger {
    //定义一个方法表示注册用户
    //参数Person：此时可以传递Person本身对象，同时也可以传递person所有的子类对象
    public void register(Person person) {
        System.out.println("姓名为"+person.getName()+"的用户注册成功！,账户"+person.getUserName()+"，密码"+person.getPassword());
        person.work();
    }
}
