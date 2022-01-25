package com.lyh.java.factory.absfactory;

/**
 * @author LYHstart
 * @create 2022-01-25 9:54
 */
public class LDPepperPizza extends Pizza
{
    @Override
    public void prepare() {
        System.out.println("准备LDPepperPizza");
    }
}
