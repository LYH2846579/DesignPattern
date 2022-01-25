package com.lyh.java.factory.absfactory;

import java.util.Scanner;

/**
 * @author LYHstart
 * @create 2022-01-25 9:57
 */
public class OrderPizza
{
    AbsFactory factory;

    public OrderPizza(AbsFactory factory)
    {
        this.factory = factory;

        Scanner scan = new Scanner(System.in);
        System.out.println("订购的Pizza种类为:");

        String type = scan.next();
        Pizza pizza = factory.createPizza(type);

        if(pizza != null)
        {
            //披萨制作
            System.out.println("订购成功!");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        else
        {
            System.out.println("订购失败!");
        }
    }
}
