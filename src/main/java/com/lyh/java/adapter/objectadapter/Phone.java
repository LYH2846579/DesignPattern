package com.lyh.java.adapter.objectadapter;

/**
 * @author LYHstart
 * @create 2022-01-27 10:07
 */
public class Phone
{
    public void charging(IVoltage5V iVoltage5V)
    {
        if(iVoltage5V.output5V() == 5)
        {
            System.out.println("手机正在充电");
        }
        else
            System.out.println("电压异常手机不在充电");
    }
}
