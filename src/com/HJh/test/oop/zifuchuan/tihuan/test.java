package com.HJh.test.oop.zifuchuan.tihuan;
//String replace(旧值，新值）      替换
//        注意点：只有返回值才是替换之后的结果

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        /*需求：
        过滤玩游戏中骂人的脏话*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要过滤的文字：");
        String content = sc.next();

        //定义敏感词库，用来替换
        String[] badWords = new String[]{"TMD", "SB", "XC","tmd", "sb", "xc"};
        int index = 0;
        while (index < badWords.length){
            content = content.replace(badWords[index], "***");
            index++;
        }
        System.out.println(content);

    }
}
