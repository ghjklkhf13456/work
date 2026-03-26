package com.HJh.test.ZuoYeTest;
/*编写程序定义圆类Circle，把圆的性质和行为用代码块封装起来。
圆的性质包括圆的半径，圆心坐标，行为包括计算圆面积，计算圆周长、设置半径、获取半径、计算圆个数。
实例化若干个圆对象，调用相应方法计算出圆面积、圆周长并计圆个数。*/
public class circleJiSuan
{
    //半径成员变量
    private double radius;
    //圆心成员变量
    private double x, y;
    //圆对象个数成员变量
    private static int num;
    //圆周率常量
    public static final double PI = 3.14159;
    //无参构造方法
    public circleJiSuan(){  num ++;  }
    //带参数构造方法
    public circleJiSuan(double r) throws Exception
    {
        if (r < 0) { throw new Exception("圆半径不能为负数"); }
        else {  radius = r;    num ++; }
    }
    public double getRadius(){  return radius;  }
    public void  setRadius(double r) throws Exception
    {
        if (r < 0) { throw new Exception("圆半径不能为负数"); }
        else { radius = r; }
    }
    public static int getNum(){   return num; }
    public double calcArea(){   return PI * radius * radius; }
    public double calcGirth(){  return 2 * PI * radius; }
    public static void main(String args[])
    {
        try {
            circleJiSuan c1 = new circleJiSuan(3.5);
            System.out.printf("构建了半径为%.2f的圆1，圆面积%.2f、周长%.2f\n",
                    c1.getRadius(), c1.calcArea(), c1.calcGirth());
            System.out.printf("目前圆对象个数为 %d\n",circleJiSuan.getNum());
            circleJiSuan c2 = new circleJiSuan(10);
            System.out.printf("构建了半径为%.2f的圆2，圆面积%.2f、周长%.2f\n", c2.getRadius(), c2.calcArea(), c2.calcGirth());
            System.out.printf("目前圆对象个数为 %d\n",circleJiSuan.getNum());
            circleJiSuan c3 = new circleJiSuan();
            System.out.printf("构建了半径为%.2f的圆3\n", c3.getRadius());
            c3.setRadius(1);
            System.out.printf("圆3半径更改为%.2f，这时圆面积%.2f、周长%.2f\n", c3.getRadius(), c3.calcArea(), c3.calcGirth());
            System.out.printf("目前圆对象个数为 %d\n",circleJiSuan.getNum());
        } catch(Exception e)
        {
            System.out.println("异常：" + e);
        }
        finally
        {
            System.out.print("——程序结束。");
        }
    }
}
