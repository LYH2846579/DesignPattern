package com.lyh.java.bridge;

/**
 * @author LYHstart
 * @create 2022-01-28 13:35
 */
public class FoldedPhone extends Phone
{
    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    //重写方法

    @Override
    public void open() {
        super.open();
        System.out.println("折叠手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠手机");
    }

    @Override
    public void running() {
        super.running();
        System.out.println("折叠手机");
    }
}
