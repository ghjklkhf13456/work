package com.HJh.test.oop.jiekou.jiekoulianxi2;

public class InterImple1 implements StuDataInter{

    private Student[] students;
    public InterImple1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAll() {
        System.out.println("打印所有学生的信息");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("姓名："+s.getName()+" 性别："+s.getSex()+" 分数："+s.getScore());
        }
    }

    @Override
    public void printAvg() {
        System.out.println("打印所有学生的平均分");
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();

        }
        System.out.println("平均分："+(double)sum/students.length);
    }
}
