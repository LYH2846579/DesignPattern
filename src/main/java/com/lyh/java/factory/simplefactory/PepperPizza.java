package com.lyh.java.factory.simplefactory;

/**
 * @author LYHstart
 * @create 2022-01-24 11:12
 */
public class PepperPizza extends Pizza
{
    @Override
    public void prepare() {
        System.out.println("PepperPizza正在准备");
    }
}
