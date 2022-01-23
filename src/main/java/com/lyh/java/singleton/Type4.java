package com.lyh.java.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-23 11:41
 */
public class Type4
{
    @Test
    public void test01()
    {
        SingletonType4 instance = SingletonType4.getInstance();
        SingletonType4 instance1 = SingletonType4.getInstance();
        System.out.println(instance.toString());
        System.out.println(instance1.toString());
    }
}


class SingletonType4
{
    //1. 静态变量
    private static SingletonType4 instance;

    //2. 私有化构造器
    private SingletonType4()
    {}

    //3. 提供一个静态的公有方法，当使用到该方法的时候，才去创建instance
    public synchronized static SingletonType4 getInstance()
    {
        if(instance == null)
            instance = new SingletonType4();
        return instance;
    }
}