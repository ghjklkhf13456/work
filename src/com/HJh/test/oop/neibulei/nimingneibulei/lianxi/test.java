package com.HJh.test.oop.neibulei.nimingneibulei.lianxi;

public class test {


    // 定义操作接口
    interface Operation {
        int calculate(int a, int b);

        String getDescription();
    }

    // 执行操作的方法
    public static void execute(int x, int y, Operation op) {
        System.out.println("操作: " + op.getDescription());
        System.out.println("结果: " + op.calculate(x, y));
        System.out.println("---");
    }

    public static void main(String[] args) {
        // 任务一：加法
        Operation add = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }

            @Override
            public String getDescription() {
                return "加法";
            }
        };
        execute(10, 5, add);

        // 任务二：乘法（使用外部变量）
        final int factor = 3;
        Operation multiply = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a * b * factor; // 访问外部 effectively final 变量
            }

            @Override
            public String getDescription() {
                return "乘以系数" + factor;
            }
        };
        execute(10, 1, multiply);

        // 任务三：带状态的减法（注意：匿名内部类不能声明静态成员，但可以有实例字段）
        Operation minus = new Operation() {
            private int count = 0; // 匿名内部类的实例字段

            @Override
            public int calculate(int a, int b) {
                count++;
                return a - b;
            }

            @Override
            public String getDescription() {
                return "减法(已执行" + count + "次)";
            }
        };
        execute(10, 5, minus);
        execute(20, 3, minus); // 观察count是否累计
    }

}
