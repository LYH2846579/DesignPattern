package com.lyh.java.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-23 11:51
 *
 * 使用双重检查的方式实现
 * 使用volatile关键字
 */
public class Type6
{
    @Test
    public void test01()
    {
        SingletonType6 instance = SingletonType6.getInstance();
        SingletonType6 instance1 = SingletonType6.getInstance();
        System.out.println(instance.toString());
        System.out.println(instance1.toString());
    }
}

class SingletonType6
{
    //1. 静态变量
    private volatile static SingletonType6 instance;

    //2. 私有化构造器
    private SingletonType6()
    {}

    //3. 使用双重检验
    public static SingletonType6 getInstance()
    {
        if(instance == null)
        {
            synchronized (SingletonType6.class){
                if(instance == null)
                    instance = new SingletonType6();
            }
        }
        return instance;
    }
}
