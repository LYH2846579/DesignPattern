package com.lyh.java.singleton;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-23 12:28
 *
 * 使用内部类的方式实现
 */
public class Type7
{
    @Test
    public void test01()
    {
        SingletonType7 instance = SingletonType7.getInstance();
        System.out.println(instance);
    }

}


class SingletonType7
{
    //1. 构造器私有化
    private SingletonType7()
    {

    }

    //2. 写一个静态内部类，该类之中有一个静态属性,SingletonType7
    private static class SingletonInstance
    {
        private static final SingletonType7 INSTANCE = new SingletonType7();
    }

    //3. 提供一个静态的私有方法，直接返回SingletonInstance.Instance
    public static SingletonType7 getInstance()
    {
        return SingletonInstance.INSTANCE;
    }


}