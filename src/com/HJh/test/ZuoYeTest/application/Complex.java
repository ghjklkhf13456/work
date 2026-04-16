package com.HJh.test.ZuoYeTest.application;

public class Complex {
    private int RealPart;
    private int ImaginPart;

    public void complexAdd(Complex c){
        int resReal=c.RealPart+getRealPart();
        int resImag=c.ImaginPart+getImaginPart();
        System.out.println(resReal+"+"+resImag+"i");
    }

    @Override
    public String toString() {
        return RealPart +"+"+ ImaginPart+"i";
    }

    public Complex() {
    }

    public Complex(int realPart, int imaginPart) {
        RealPart = realPart;
        ImaginPart = imaginPart;
    }

    public int getRealPart() {
        return RealPart;
    }

    public void setRealPart(int realPart) {
        RealPart = realPart;
    }

    public int getImaginPart() {
        return ImaginPart;
    }

    public void setImaginPart(int imaginPart) {
        ImaginPart = imaginPart;
    }
}
