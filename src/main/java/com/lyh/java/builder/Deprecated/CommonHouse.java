package com.lyh.java.builder.Deprecated;

/**
 * @author LYHstart
 * @create 2022-01-26 9:21
 */
public class CommonHouse extends AbstractHouse
{
    @Override
    public void buildBasic() {
        System.out.println("为普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("为普通房子砌墙");
    }

    @Override
    public void roofd() {
        System.out.println("为普通房子封顶");
    }
}
