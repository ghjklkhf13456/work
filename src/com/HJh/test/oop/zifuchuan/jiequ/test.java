package com.HJh.test.oop.zifuchuan.jiequ;
//public String substring(int beginIndex,int endIndex):
//截取指定范围
//public String substring(int beginIndex):
//截取到末尾
public class test {
    public static void main(String[] args) {
        String str = "abcdefg";
        char jieQu1 = str.charAt(0);
        String result1 = jieQu1+"***";
        System.out.println(result1);

        String jieQu2 = str.substring(0,1);
        String result2 = jieQu2+"***";
        System.out.println(result2);

    }
}
