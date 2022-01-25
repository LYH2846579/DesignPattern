package com.lyh.java.factory.absfactory;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-25 10:00
 */
public class PizzaStore
{
    @Test
    public void test01()
    {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
