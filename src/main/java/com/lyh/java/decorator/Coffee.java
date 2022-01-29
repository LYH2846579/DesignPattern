package com.lyh.java.decorator;

/**
 * @author LYHstart
 * @create 2022-01-29 10:22
 */
public class Coffee extends Drink
{
    @Override
    public Double calculate() {
        return super.getPrise();
    }
}
