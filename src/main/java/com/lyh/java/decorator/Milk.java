package com.lyh.java.decorator;

/**
 * @author LYHstart
 * @create 2022-01-29 10:32
 */
public class Milk extends Decorator
{
    public Milk(Drink drink) {
        super(drink);
        setDes(" 牛奶 ");
        setPrise(2.0);
    }
}
