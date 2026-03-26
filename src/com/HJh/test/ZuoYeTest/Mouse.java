package com.HJh.test.ZuoYeTest;

public class Mouse extends Animal
{
    public Mouse() throws Exception
    {
        this.setName("老鼠");
        this.setFood("残羹冷炙!");
    }
    // 打洞行为
    public void dig()
    {
        System.out.println(this.getName()+"会打洞");
    }
}
