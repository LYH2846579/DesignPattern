package com.lyh.java.bridge;

/**
 * @author LYHstart
 * @create 2022-01-28 13:21
 */
public abstract class Phone
{
    //将Bread作为一个私有属性存在 -> 使用构造器进行赋值
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open()
    {
        brand.open();
    }

    public void close()
    {
        brand.close();
    }

    public void running()
    {
        brand.running();
    }

}
