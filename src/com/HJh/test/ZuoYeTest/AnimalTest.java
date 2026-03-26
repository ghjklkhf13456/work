package com.HJh.test.ZuoYeTest;

public class AnimalTest
{
    public static void main(String[] args) throws Exception
    {
        //创建老鼠
        Mouse m=new Mouse();
//老鼠吃
        m.eat();
//老鼠睡觉
        m.sleep();
//老鼠打洞
        m.dig();
        System.out.println("-------分割线--------");
//创建熊猫
        Panda p= new Panda();
        //熊猫吃
        p.eat();
        //熊猫睡觉
        p.sleep();
    }
}
