package com.lyh.java.decorator;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-29 10:34
 */
public class CoffeeBar
{
    @Test
    public void test01()
    {
        Drink drink = new Espresso();
        Milk order = new Milk(drink);

        order = new Milk(order);

        System.out.println(order.getDes());
        System.out.println(order.getPrise());
    }
}
