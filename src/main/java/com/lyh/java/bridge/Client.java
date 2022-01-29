package com.lyh.java.bridge;

import org.junit.jupiter.api.Test;

/**
 * @author LYHstart
 * @create 2022-01-28 13:36
 */
public class Client
{
    @Test
    public void test01()
    {
        FoldedPhone phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.running();
        phone.close();
    }
}
