package com.HJh.test.ZuoYeTest.yifu;

public abstract class Clothing {
    private int id;
    private String description;
    private double price;
    private String colorCode;
    public abstract void calculateID();

    public Clothing() {
    }

    public Clothing(int id, String description, double price, String colorCode) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.colorCode = colorCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
