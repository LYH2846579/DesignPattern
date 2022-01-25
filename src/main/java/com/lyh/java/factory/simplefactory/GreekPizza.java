package com.lyh.java.factory.simplefactory;

/**
 * @author LYHstart
 * @create 2022-01-24 11:11
 */
public class GreekPizza extends Pizza
{
    @Override
    public void prepare() {
        System.out.println("GreekPizza正在准备");
    }
}
