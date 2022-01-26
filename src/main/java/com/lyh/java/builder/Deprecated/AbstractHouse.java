package com.lyh.java.builder.Deprecated;

/**
 * @author LYHstart
 * @create 2022-01-26 9:19
 */
public abstract class AbstractHouse
{
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofd();

    public void build()
    {
        buildBasic();
        buildWalls();
        roofd();
    }

}
