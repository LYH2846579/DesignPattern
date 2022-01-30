package com.lyh.java.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author LYHstart
 * @create 2022-01-30 9:22
 */
public class University extends OrganizationComponent
{
    //以OrganizationComponent的形式创建一个链表
    List<OrganizationComponent> list = new LinkedList<>();

    //调用父类构造器
    public University(String name, String des) {
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
