package com.HJh.test.oop.jihe;

import java.util.ArrayList;
import java.util.Collections;

//要求：
//定义一个 Student 类，包含属性：学号（String）、姓名（String）、成绩（int）。
//使用 ArrayList<Student> 存储学生信息。
//实现以下功能：
//添加学生：向列表中添加新学生。
//根据学号删除学生：从列表中移除指定学号的学生（假设学号唯一）。
//根据学号查找学生：显示学生信息，若不存在则给出提示。
//显示所有学生：遍历并打印所有学生信息。
//计算平均成绩：计算并输出所有学生的平均分。
//按成绩降序排序：将学生按成绩从高到低排序，并输出结果。
public class test {
    /**
     * 主类：演示 ArrayList 的各种操作
     */

    // 存储学生的 ArrayList
    private static ArrayList<Student> students = new ArrayList<>();

    // 1. 添加学生
    public static void addStudent(Student student) {
        students.add(student);
        System.out.println("添加成功：" + student);
    }

    // 2. 根据学号删除学生
    public static void removeStudentById(String id) {
        // 使用 removeIf 删除匹配学号的学生，返回是否删除了任何元素
        boolean removed = students.removeIf(s -> s.getId().equals(id));
        if (removed) {
            System.out.println("已删除学号为 " + id + " 的学生。");
        } else {
            System.out.println("未找到学号为 " + id + " 的学生，删除失败。");
        }
    }

    // 3. 根据学号查找学生
    public static void findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("查找成功：" + s);
                return;
            }
        }
        System.out.println("未找到学号为 " + id + " 的学生。");
    }

    // 4. 显示所有学生
    public static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("当前没有学生信息。");
            return;
        }
        System.out.println("===== 所有学生列表 =====");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("=======================");
    }

    // 5. 计算平均成绩
    public static void calculateAverageScore() {
        if (students.isEmpty()) {
            System.out.println("没有学生，无法计算平均分。");
            return;
        }
        int sum = 0;
        for (Student s : students) {
            sum += s.getScore();
        }
        double average = (double) sum / students.size();
        System.out.printf("学生平均成绩：%.2f\n", average);
    }

    // 6. 按成绩降序排序并显示
    public static void sortByScoreDescending() {
        if (students.isEmpty()) {
            System.out.println("没有学生，无法排序。");
            return;
        }
        // 使用 Comparator 进行降序排序（成绩从高到低）
        Collections.sort(students, (s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()));
        System.out.println("===== 按成绩降序排序结果 =====");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("=============================");
    }

    // 主方法：测试所有功能
    public static void main(String[] args) {
        // 1. 添加学生
        System.out.println("--- 添加学生 ---");
        addStudent(new Student("001", "张三", 85));
        addStudent(new Student("002", "李四", 92));
        addStudent(new Student("003", "王五", 78));
        addStudent(new Student("004", "赵六", 88));

        // 2. 显示所有学生
        displayAllStudents();

        // 3. 查找学生（存在和不存在的情况）
        System.out.println("\n--- 查找学生 ---");
        findStudentById("002");
        findStudentById("999");

        // 4. 删除学生（存在和不存在的情况）
        System.out.println("\n--- 删除学生 ---");
        removeStudentById("002");
        removeStudentById("999");
        displayAllStudents();   // 删除后再次显示

        // 5. 计算平均成绩
        System.out.println("\n--- 计算平均分 ---");
        calculateAverageScore();

        // 6. 按成绩降序排序并显示
        System.out.println("\n--- 成绩排序 ---");
        sortByScoreDescending();
    }
}



// 学生类
class Student {
    private String id;      // 学号
    private String name;    // 姓名
    private int score;      // 成绩

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // 重写 toString 方法，用于打印学生信息，如果不重写，默认打印对象地址
    @Override
    public String toString() {
        return "学号：" + id + "，姓名：" + name + "，成绩：" + score;
    }
}
