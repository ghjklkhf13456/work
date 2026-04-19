package com.HJh.test.oop.jiekou.jiekoulianxi2;

public class test {
    public static void main(String[] args) {
/*        第1套方案:能打印出班级全部学生的信息；能打印班级全部学生的平均分。
          第2套方案:能打印出班级全部学生的信息（包含男女人数）；能打印班级全部学生的平均分（要求是去掉最高分、最低分）。*/
        Student[] students = new Student[5];
        students[0] = new Student("张三","男",90);
        students[1] = new Student("李四","女",80);
        students[2] = new Student("王五","男",99);
        students[3] = new Student("赵六","女",60);
        students[4] = new Student("孙七","男",77);

        //匿名内部类
        StuDataInter sdi = new StuDataInter() {
            @Override
            public void printAll() {
                System.out.println("用匿名内部类实现");
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
         };
        SystemPrint.print(sdi);


        System.out.println("--------------------------------------------------------------");
        InterImple1 interImple1 = new InterImple1(students);
        InterImple2 interImple2 = new InterImple2(students);
        SystemPrint.print(interImple1);
        SystemPrint.print(interImple2);
    }
}
