package com.HJh.test.ZuoYeTest;
/*编程实现类的继承。编写父类People，子类Student继承自人类。
人类具有姓名，性别，年龄等性质，还具有吃和说的行为。学生类继承父类，还拥有学号性质和学习行为。
构造人类和学生类的对象，调用吃、说、学习的方法输出有关信息。*/

//人类
public class People
{
    protected String name;
    protected char sex;
    protected int age;
    public People(String name, char sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    //吃方法
    public void eat()
    {
        System.out.println(name + "在吃...");
    }
    //说方法
    public void speek()
    {
        System.out.println(name + "在说...");
    }
}
//继承人类的学生类
class Student extends People
{
    //学号
    protected String stuNo;
    public Student(String stuNo, String name, char sex, int age)
    {
        super(name, sex, age);
        this.stuNo = stuNo;
    }
    //学习方法
    public void learn()
    {
        System.out.println(name + "在学习...");
    }
    public static void main(String[] args)
    {
        People person = new People("张三", '男', 21);
        person.eat();
        person.speek();
        System.out.println();
        Student aStudent = new Student("01", "李四", '男', 18);
        aStudent.eat();
        aStudent.speek();
        aStudent.learn();
    }
}

