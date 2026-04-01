package com.HJh.test.oop.neibulei.nimingneibulei;
//匿名内部类的定义格式：
//new类名/接口名(){
//    重写类/接口里面的方法；
//    }
//    匿名内部类的定义格式= 没有名字的java类 + 继承/实现 + 重写方法 + 创建对象
//    最终格式可以理解为：是一个没有名字的java类的对象

//没有名字的java类：大括号
//Swim：就是这个没有名字的java类实现了swim接口
//重写方法：我们要在大括号当中重写swim所有的抽象方法
//创建对象：new关键字作用的是后面这个没有名字的java类(大括号的内容)，创建了他(大括号的内容)的对象
//整体：创建了一个Swim实现类的对象，只不过这个类没有名字而己
public class test {
    public static void main(String[] args) {
        //现在有一个接口Swim，正常实现接口的时候，应该创建一个java类让他来实现接口并重写方法，然后创建对象，
        //再用这个对象去调用重写的接口方法
        //但是现在如果我只想实现一次这个接口，那么这个java类就有点占用空间，所以可以使用匿名内部类来节省一个java类文件


        //大括号就是创建一个匿名内部类（没有名字的java类），用它来实现Swim接口，然后创建对象，
        //注意：new关键字作用是后面这个匿名内部类（大括号的内容），
        Swim s = new Swim() {
            //重写接口所有的方法
            @Override
            public void swim() {
                System.out.println("匿名内部类实现接口Swim");
            }
            @Override
            public void aaa() {
                System.out.println("匿名内部类实现接口Swim的aaa方法");
            }
            @Override
            public void bbb() {
                System.out.println("匿名内部类实现接口Swim的bbb方法");
            }
        };
        s.aaa();
        goSwimming(s);
    }
    public static void goSwimming(Swim s){
        s.swim();
        s.aaa();
        s.bbb();
    }
}
