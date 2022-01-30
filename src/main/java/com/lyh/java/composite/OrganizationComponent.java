package com.lyh.java.composite;

/**
 * @author LYHstart
 * @create 2022-01-30 9:19
 */
public abstract class OrganizationComponent
{
    //私有属性
    private String name;
    private String des;

    //构造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    //add、remove方法
    public void add(OrganizationComponent oc)
    {
        //针对于叶子节点，不支持进行add和remove方法
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent oc)
    {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "OrganizationComponent{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
