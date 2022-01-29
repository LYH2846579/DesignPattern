package com.lyh.java.bridge;

/**
 * @author LYHstart
 * @create 2022-01-28 13:23
 */
public class Vivo implements Brand
{

    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void running() {
        System.out.println(" Vivo手机正在运行 ");
    }
}
