package com.lyh.java.builder;

/**
 * @author LYHstart
 * @create 2022-01-26 10:12
 */
public abstract class HouseBuilder
{
    protected House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse()
    {
        return house;
    }

}
