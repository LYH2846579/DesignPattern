package com.lyh.java.composite;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-30 9:26
 */
public class Client
{
    @Test
    public void test01()
    {
        //创建University
        University university = new University("Harbin institute of technology","HIT");

        //创建学院
        College csCollege = new College("CS","CS");
        College infoCollege = new College("info","info");

        //创建系
        Department d1 = new Department("p1","p1");
        Department d2 = new Department("p2","p2");
        Department d3 = new Department("p3","p3");

        //将系添加到学院之中
        csCollege.add(d1);
        csCollege.add(d2);
        infoCollege.add(d3);

        //将学院添加到学校之中
        university.add(csCollege);
        university.add(infoCollege);

        //打印
        System.out.println(university.toString());

    }
}
