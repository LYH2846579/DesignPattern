package com.lyh.java.factory.absfactory;

/**
 * @author LYHstart
 * @create 2022-01-25 9:51
 */
public class BJFactory implements AbsFactory
{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese"))
        {
            pizza = new BJCheesePizza();
            pizza.setName("BJCheesePizza");
        }
        else
        {
            pizza = new BJPepperPizza();
            pizza.setName("BJPepperPizza");
        }

        return pizza;
    }
}
