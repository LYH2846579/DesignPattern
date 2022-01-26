package com.lyh.java.builder;

/**
 * @author LYHstart
 * @create 2022-01-26 10:17
 */
public class CommonHouse extends HouseBuilder
{
    @Override
    public void buildBasic() {
        System.out.println("建造普通房屋地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("为普通房屋建造墙壁");
    }

    @Override
    public void roofed() {
        System.out.println("为普通房屋封顶");
    }
}
