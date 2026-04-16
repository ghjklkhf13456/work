package com.HJh.test.ZuoYeTest.yifu;

public class Hat extends Clothing{

    public void displayHatInformation(){
        System.out.println(getDescription());
    }

    @Override
    public void calculateID() {
        System.out.println(getId());
    }

    public Hat() {
    }

    public Hat(int id, String description, double price, String colorCode) {
        super(id, description, price, colorCode);
    }
}
