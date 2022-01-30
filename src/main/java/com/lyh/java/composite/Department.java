package com.lyh.java.composite;

/**
 * @author LYHstart
 * @create 2022-01-30 9:30
 *
 * 系
 */
public class Department extends OrganizationComponent
{
    //没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String toString()
    {
        return getName();
    }
}
