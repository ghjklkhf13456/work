package com.HJh.test.ZuoYeTest.yifu;

public class Shirt extends Clothing {
    public void displayShirtInformation(){
        System.out.println(getDescription());
    }

    @Override
    public void calculateID() {
        System.out.println(getId());
    }

    public Shirt() {
    }

    public Shirt(int id, String description, double price, String colorCode) {
        super(id, description, price, colorCode);
    }

}
