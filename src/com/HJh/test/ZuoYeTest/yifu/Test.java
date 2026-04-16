package com.HJh.test.ZuoYeTest.yifu;

public class Test {
    public static void main(String[] args) {
        //寻常的创建对象
        Shirt shirt = new Shirt(1,"短袖",99,"blue");
        Hat hat = new Hat(2,"帽子",100,"red");
        System.out.println(shirt.getId()+shirt.getDescription()+
                shirt.getPrice()+shirt.getColorCode());
        System.out.println(hat.getId()+hat.getDescription()+
                hat.getPrice()+hat.getColorCode());
        //一般的多态
        Clothing h = new Hat(1,"短袖",99,"blue");
        Clothing S = new Shirt(2,"帽子",100,"red");
        System.out.println(h.getId()+h.getDescription()+
                h.getPrice()+h.getColorCode());
        System.out.println(S.getId()+S.getDescription()+
                S.getPrice()+S.getColorCode());
        //使用工具类的多态
        SystemCloth.register(shirt);
        SystemCloth.register(hat);
    }
}
