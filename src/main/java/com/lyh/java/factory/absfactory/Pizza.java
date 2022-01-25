package com.lyh.java.factory.absfactory;

/**
 * @author LYHstart
 * @create 2022-01-24 10:51
 *
 * 抽象的Pizza类
 */
public abstract class Pizza
{
    private String name;

    public void prepare()
    {}

    public void bake()
    {
        System.out.println(name+"正在烘焙");
    }

    public void cut()
    {
        System.out.println(name+"正在切割");
    }

    public void box()
    {
        System.out.println(name+"正在装箱");
    }

    public void setName(String name) {
        this.name = name;
    }
}
