package com.HJh.test.oop.jiekou.jiekouyongfa;
//接口：接口就是一个规则，而且是独立于继承体系以外的规则。（可以理解为干爹）
//也就是不是所有的类都有一个相似的独属方法，该方法不能抽象到父类，因为不是所有的方法都要重写，所以就有接口来给需要的类提供方法。
//接口里面存放抽象方法，但是类名没有abstract关键字

//格式：关键字interface来定义
//public interface接口名{..}
//使用：接口和类之间的是实现关系，通过implements关键字表示
//public class类名implements接口{...}

//注意点1：接口不能实例化
//注意点2：接口的子类（实现类），要么重写接口中所有的抽象方法，要么实现类是一个抽象类
//注意点3：一个类可以实现多个接口，也可以在继承一个类的同时，实现多个接口
//public class类名implements接口1，接口2...}
//public class类名extends父类implements接口1，接口2{...}

//接口中成员的特点
//  成员变量：只能是常量。默认修饰符：public static final
//  构造方法：没有
//  成员方法：只能是抽象方法。默认修饰符：public abstract

//接口和类之间的关系
//    类和类的关系
//        继承关系，只能单继承，不能多继承，但是可以多层继承
//    类和接口的关系
//        实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
//    接口和接口的关系
//        继承关系，可以单继承，也可以多继承
public class test {
    public static void main(String[] args) {
        /*青蛙Frog
            属性：名字，颜色
            行为：吃虫子，蛙泳
          狗Dog
            属性：名字，颜色
            行为：吃骨头，狗刨
          兔子Rabbit
            属性：名字，颜色
            行为：吃胡萝卜*/


        Frog f = new Frog("小青", "青色");
        System.out.println(f.getName() + " " + f.getColor());
        f.eat();
        f.swim();
        Dog d = new Dog("小狗", "黑色");
        System.out.println(d.getName() + " " + d.getColor());
        d.eat();
        d.swim();
        Rabbit r = new Rabbit("小兔子", "白色");
        System.out.println(r.getName() + " " + r.getColor());
        r.eat();

    }
}
