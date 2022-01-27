package com.lyh.java.adapter.objectadapter;

/**
 * @author LYHstart
 * @create 2022-01-27 10:10
 */
public class VoltageAdapter implements IVoltage5V
{
    @Override
    public int output5V() {
        //将原适配对象以属性的方式进行内置
        Volatage220V v = new Volatage220V();

        //获取初始电压
        int srcV = v.output220V();
        //电压转换
        int dstV = srcV / 44;
        //输出电压
        return dstV;
    }
}
