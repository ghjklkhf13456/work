package com.HJh.test.ZuoYeTest.yifu;

public class SystemCloth {
    private SystemCloth() {
    }

    public static void register(Clothing clothing) {
        System.out.println(clothing.getId()+clothing.getDescription()+
                clothing.getPrice()+clothing.getColorCode());

    }
}
