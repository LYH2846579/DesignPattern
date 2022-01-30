package com.lyh.java.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author LYHstart
 * @create 2022-01-30 9:25
 */
public class College extends OrganizationComponent
{
    //以OrganizationComponent的形式创建一个链表
    List<OrganizationComponent> list = new LinkedList<>();


    public College(String name, String des) {
        super(name, des);
    }

    //重写add和remove方法
    @Override
    public void add(OrganizationComponent oc) {
        list.add(oc);
    }
    @Override
    public void remove(OrganizationComponent oc) {
        list.remove(oc);
    }

    @Override
    public String toString() {
        return "University{" +
                "list=" + list +
                '}';
    }
}
