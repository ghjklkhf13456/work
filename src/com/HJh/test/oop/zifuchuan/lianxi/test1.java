package com.HJh.test.oop.zifuchuan.lianxi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /*键盘录入任意字符串，请按长度为8拆分每个输入字符串并进行输出
        长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
        举例：
        输入：abcdabcda
        输出：
        第一行：abcdabcd
        第二行：a0000000*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意字符串：");
        String str = sc.next();

        int lastCount = str.length()%8;
        int count = 8-lastCount;
        if(lastCount>0){
            String str0 = "00000000".substring(0,count);
            str = str+str0;
        }
        for(int i=0;i<str.length();i+=8){
            System.out.println(str.substring(i,i+8));
        }


    }
}
