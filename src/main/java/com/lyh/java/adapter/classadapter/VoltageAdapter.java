package com.lyh.java.adapter.classadapter;

/**
 * @author LYHstart
 * @create 2022-01-27 10:10
 */
public class VoltageAdapter extends Volatage220V implements IVoltage5V
{
    @Override
    public int output5V() {
        //获取初始电压
        int srcV = output220V();
        //电压转换
        int dstV = srcV / 44;
        //输出电压
        return dstV;
    }
}
