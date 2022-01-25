package com.lyh.java.factory.simplefactory;

/**
 * @author LYHstart
 * @create 2022-01-24 11:12
 */
public class CheesePizza extends Pizza
{
    @Override
    public void prepare() {
        System.out.println("CheesePizza正在准备");
    }
}
