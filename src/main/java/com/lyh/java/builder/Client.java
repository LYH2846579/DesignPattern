package com.lyh.java.builder;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-26 10:24
 *
 * 测试
 */
public class Client
{
    @Test
    public void test01()
    {
        CommonHouse house = new CommonHouse();
        HouseDirector hd = new HouseDirector(house);
        House house1 = hd.constractHouse();
        System.out.println(house1);
    }
}
