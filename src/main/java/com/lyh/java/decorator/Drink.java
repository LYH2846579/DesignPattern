package com.lyh.java.decorator;

/**
 * @author LYHstart
 * @create 2022-01-29 10:20
 */
public abstract class Drink
{
    private String des;
    private Double prise;

    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public Double getPrise() {
        return prise;
    }
    public void setPrise(Double prise) {
        this.prise = prise;
    }

    //计算价格
    public abstract Double calculate();
}
