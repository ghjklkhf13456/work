package com.HJh.test.oop.xiaoxiangmu.zhinengjiaju;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        JD[] jd = new JD[4];
        jd[0] = new TV("电视",true);
        jd[1] = new Air("空调",false);
        jd[2] = new Washmachine("洗衣机",false);
        jd[3] = new Lamp("灯",false);


        SmartHomeSyetem smartHomeSyetem = SmartHomeSyetem.getInstance();
        while (true) {
            smartHomeSyetem.showStatus(jd);
            Scanner sc = new Scanner(System.in);
            System.out.println("输入操作对象：(exit退出)");
            String command =sc.next();
            switch (command){
                case "1":
                    smartHomeSyetem.control(jd[0]);
                    break;
                case "2":
                    smartHomeSyetem.control(jd[1]);
                    break;
                case "3":
                    smartHomeSyetem.control(jd[2]);
                    break;
                case "4":
                    smartHomeSyetem.control(jd[3]);
                    break;
                case "exit":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误，重新输入");
            }
        }


    }
}
