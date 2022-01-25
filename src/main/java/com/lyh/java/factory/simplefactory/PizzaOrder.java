package com.lyh.java.factory.simplefactory;

import java.util.Scanner;

/**
 * @author LYHstart
 * @create 2022-01-24 12:12
 *
 * 通过该类进行下订单
 */
public class PizzaOrder
{
    public PizzaOrder()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入订购的种类:");
        String name = scan.next();
        Pizza pizza = SimpleFactory.CreatePizza2(name);
        if(pizza != null)
            System.out.println("订购成功!");
        else
            System.out.println("订购失败!");
    }

}
