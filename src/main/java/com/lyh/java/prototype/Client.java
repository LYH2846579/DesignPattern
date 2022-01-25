package com.lyh.java.prototype;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-25 11:20
 */
public class Client
{
    @Test   //简单测试克隆
    public void test01()
    {
        Sheep sheep = new Sheep("Jack",18,"US");
        Sheep clone1 = sheep.clone();
        Sheep clone2 = sheep.clone();
        Sheep clone3 = sheep.clone();
        Sheep clone4 = sheep.clone();
        Sheep clone5 = sheep.clone();

        System.out.println(sheep);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        System.out.println(clone5);
    }

    @Test   //测试默认的clone方法是否是浅拷贝 -> 默认为浅拷贝!
    public void test02()
    {
        Sheep sheep = new Sheep("Jack",1,"US",new Node());
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        System.out.println(sheep.getNode());
        System.out.println(sheep1.getNode());
        System.out.println(sheep2.getNode());
        System.out.println(sheep3.getNode());
    }

    @Test   //测试深拷贝 - 使用重写clone的方法进行实现
    public void test03() throws CloneNotSupportedException
    {
        DeepProtoType p = new DeepProtoType();
        p.name = "Jack";
        p.deepCloneableTarget = new DeepCloneableTarget("rose","jack's wife");

        //执行克隆
        DeepProtoType p1 = (DeepProtoType) p.clone();

        System.out.println(p.deepCloneableTarget);
        System.out.println(p1.deepCloneableTarget);
    }

    @Test   //测试深拷贝 - 使用序列化的方法进行实现
    public void test04()
    {
        DeepProtoType p = new DeepProtoType();
        p.name = "Jack";
        p.deepCloneableTarget = new DeepCloneableTarget("rose","jack's wife");

        //执行克隆
        DeepProtoType p1 = p.deepCopy();

        System.out.println(p.deepCloneableTarget);
        System.out.println(p1.deepCloneableTarget);
    }
}
