package com.HJh.test.ZuoYeTest;
/*抽象出项目问题中的对象 ：动物、老鼠、熊猫。
抽象出每种对象所具有的性质：名字和食物。
抽象出每种对象所具有的行为，动物具有吃的行为和睡觉的行为，老鼠除具有动物行为外还具有打洞行为。
抽象出继承关系，老鼠类和熊猫类作为子类继承父类动物类，子类继承父类的属性和方法。*/
//Animal.java
public class Animal
{
    private String name;
    private String food;
    //吃的行为
    public void eat() throws Exception
    {
        System.out.println(this.name+"吃"+this.food+"!");
    }
    //睡觉行为
    public void sleep()
    {
        System.out.println(this.name+"在睡觉!");
    }
    public String getName()
    {	return name;  }
    public void setName(String name)
    {   this.name = name;  }
    public String getFood()
    {   return food;  }
    public void setFood(String food)
    {	this.food = food;  }
}



