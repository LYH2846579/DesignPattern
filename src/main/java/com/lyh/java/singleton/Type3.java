package com.lyh.java.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-23 11:26
 *
 * 使用懒汉式创建（存在线程安全的方式）
 */
public class Type3
{
    @Test
    public void test01()
    {
        SingletonType3 instance = SingletonType3.getInstance();
        SingletonType3 instance1 = SingletonType3.getInstance();
        System.out.println(instance.toString());
        System.out.println(instance1.toString());
    }
}


class SingletonType3
{
    //1. 静态变量
    private static SingletonType3 instance;

    //2. 私有化构造器
    private SingletonType3()
    {}

    //3. 提供一个静态的公有方法，当使用到该方法的时候，才去创建instance
    public static SingletonType3 getInstance()
    {
        if(instance == null)
            instance = new SingletonType3();
        return instance;
    }
}