package com.lyh.java.factory.simplefactory;

/**
 * @author LYHstart
 * @create 2022-01-24 11:13
 */
public class SimpleFactory
{
    public Pizza CreatePizza(String name)
    {
        Pizza pizza = null;

        System.out.println("简单工厂模式");
        if(name.equals("greek"))
        {
            pizza = new GreekPizza();
            pizza.setName("greek");
        }
        else if(name.equals("cheese"))
        {
            pizza = new GreekPizza();
            pizza.setName("cheese");
        }

        return pizza;
    }

    public static Pizza CreatePizza2(String name)
    {
        Pizza pizza = null;

        System.out.println("简单工厂模式");
        if(name.equals("greek"))
        {
            pizza = new GreekPizza();
            pizza.setName("greek");
        }
        else if(name.equals("cheese"))
        {
            pizza = new GreekPizza();
            pizza.setName("cheese");
        }

        //制作过程
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
