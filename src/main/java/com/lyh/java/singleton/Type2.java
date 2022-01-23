package com.lyh.java.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-23 10:38
 *
 * 使用静态代码块的方式实现饿汉式
 */
public class Type2
{
    @Test
    public void test01()
    {
        SingletonType2 instance = SingletonType2.getInstance();
        SingletonType2 instance1 = SingletonType2.getInstance();
        System.out.println(instance.toString());
        System.out.println(instance1.toString());
    }
}


class SingletonType2
{
    //1. 私有化构造器
    private SingletonType2()
    {}

    //2. 创建一个静态变量
    private static SingletonType2 instance;

    //3. 使用静态代码块实现
    static
    {
        instance = new SingletonType2();
    }

    //4. 创建一个获取实例的方法getInstance
    public static SingletonType2 getInstance()
    {
        return instance;
    }
}