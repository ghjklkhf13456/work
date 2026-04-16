package com.HJh.test.oop.jiekou.jiekouxintexing3;

public interface Inter {
    //非常的冗余，所以需要提取重复代码,private让外界无法访问无意义的代码
    public default void login(){
//        System.out.println("检查网络");
//        System.out.println("检查用户状态");
//        System.out.println("检查密码");
        check();
        System.out.println("登录");
    }
    public default void register(){
//        System.out.println("检查网络");
//        System.out.println("检查用户状态");
//        System.out.println("检查密码");
        check();
        System.out.println("注册");
    }
    private  void check(){
        System.out.println("检查网络");
        System.out.println("检查用户状态");
        System.out.println("检查密码");

    }
}
