package com.lyh.java.decorator;

/**
 * @author LYHstart
 * @create 2022-01-29 10:26
 */
public class Decorator extends Drink
{
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        String s1 = super.getDes() ;
        String s2 = drink.getDes();
        return s1 + " && " +s2;
    }

    @Override
    public Double calculate() {
        return super.getPrise() + drink.getPrise();
    }
}
