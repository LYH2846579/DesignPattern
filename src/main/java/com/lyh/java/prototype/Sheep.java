package com.lyh.java.prototype;

/**
 * @author LYHstart
 * @create 2022-01-25 11:15
 *
 * 实现羊的克隆
 */
public class Sheep implements Cloneable
{
    private String name;
    private Integer age;
    private String address;
    private Node node;

    public Sheep() {
    }
    public Sheep(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Sheep(String name, Integer age, String address, Node node) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.node = node;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Node getNode() {
        return node;
    }
    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //重写clone
    @Override //可以修改返回值!
    protected Sheep clone(){

        Sheep sheep = null;
        try
        {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return sheep;
    }
}
