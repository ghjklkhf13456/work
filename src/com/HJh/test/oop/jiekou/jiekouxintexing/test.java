package com.HJh.test.oop.jiekou.jiekouxintexing;

public class test {
    public static void main(String[] args) {
//        接口中的默认方法：
//        作用：为了接口升级而存在的
//        在后期开发时，可能会在接口中添加新的方法，此时实现了不想修改的接口方法，那么就可以在接口中使用默认方法

//        格式：public default 返回值类型 方法名(参数列表）{...}
//            注意事项：
//            1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
//            2.public可以省略，default不能省略
//            3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
        InterImpl ii = new InterImpl();
        ii.function();

    }
}
