package com.lyh.java.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-23 9:11
 *
 * 以静态常量的形式实现单例模式（饿汉式）
 */
public class Type1
{
    @Test
    public void test01()
    {
        SingletonType1 st = SingletonType1.getInstance();
        SingletonType1 st1 = SingletonType1.getInstance();
        System.out.println(st.toString());
        System.out.println(st1.toString());
    }

}


class SingletonType1
{
    //1. 私有化构造器
    private SingletonType1()
    {

    }

    //2. 以静态变量的形式创建一个对象
    private final static SingletonType1 instance = new SingletonType1();

    //3. 提供一个公有的静态方法返回实例对象
    public static SingletonType1 getInstance()
    {
        return instance;
    }
}
