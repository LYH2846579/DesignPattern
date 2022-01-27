package com.lyh.java.adapter.objectadapter;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-27 10:12
 */
public class Client
{
    @Test
    public void test01()
    {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
