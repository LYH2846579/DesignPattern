package com.lyh.java.builder;

/**
 * @author LYHstart
 * @create 2022-01-26 10:19
 */
public class HouseDirector
{
    private HouseBuilder houseBuilder;

    //可以使用构造器进行传参
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //可以使用set方法进行传参
    public HouseBuilder getHouseBuilder() {
        return houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //构建房屋
    public House constractHouse()
    {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
