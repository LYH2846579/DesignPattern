package com.lyh.java.factory.absfactory;

import com.lyh.java.factory.simplefactory.CheesePizza;
import com.lyh.java.factory.simplefactory.PepperPizza;

/**
 * @author LYHstart
 * @create 2022-01-25 9:56
 */
public class LDFactory implements AbsFactory
{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese"))
        {
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        }
        else
        {
            pizza = new LDPepperPizza();
            pizza.setName("LDPepperPizza");
        }

        return pizza;
    }
}
