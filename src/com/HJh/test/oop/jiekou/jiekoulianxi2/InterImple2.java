package com.HJh.test.oop.jiekou.jiekoulianxi2;

public class InterImple2 implements StuDataInter{
    private Student[] students;
    public InterImple2(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAll() {
        int maleCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if(s.getSex().equals("男")){
                maleCount++;
            }
            System.out.println("姓名："+s.getName()+" 性别："+s.getSex()+" 分数："+s.getScore());

        }
        System.out.println("男学生人数："+maleCount);
        System.out.println("女学生人数："+(students.length-maleCount));
    }

    @Override
    public void printAvg() {
        int maxScore = students[0].getScore();
        int minScore = students[0].getScore();
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if(s.getScore()>maxScore){
                maxScore = s.getScore();
            }
            if(s.getScore()<minScore){
                minScore = s.getScore();
            }
        }
        System.out.println("平均分："+(double)(sum-maxScore-minScore)/(students.length-2));
    }
}
