package com.lyh.java.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LYHstart
 * @create 2022-01-25 12:02
 */
public class TestSheep
{
    @Test
    public void test01()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取两个对象
        Sheep sheep = (Sheep) context.getBean("id01");
        Sheep sheep1 = (Sheep) context.getBean("id01");
        System.out.println(sheep);
        System.out.println(sheep1);
    }
}
