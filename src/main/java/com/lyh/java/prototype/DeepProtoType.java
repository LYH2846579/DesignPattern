package com.lyh.java.prototype;

import java.io.*;

/**
 * @author LYHstart
 * @create 2022-01-25 14:56
 *
 * 深拷贝的两种实现方式
 */
public class DeepProtoType implements Serializable,Cloneable
{
    public String name; //String类型属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型变量


    public DeepProtoType()
    {
        super();
    }


    //1.深拷贝-使用重写clone方法实现
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //对引用数据类型进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deep;
    }

    //2.深拷贝-使用序列化方式进行实现
    public DeepProtoType deepCopy()
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try
        {
            //序列化
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            //反序列化
            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            if(baos != null)
            {
                try
                {
                    baos.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(oos != null)
            {
                try
                {
                    oos.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(bais != null)
            {
                try
                {
                    bais.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if(ois != null)
            {
                try
                {
                    ois.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }


        return null;
    }

    /**
     * ByteArrayOutputStream:
     *      字节数组输出流在内存中创建一个字节数组缓冲区，所有发送到输出流的数据保存在该字节数组缓冲区中。
     * ObjectOutputStream:
     *      对象的序列化流，作用：把对象转成字节数据的输出到文件中保存，对象的输出过程称为序列化，可实现对象的持久存储。
     * ByteArrayInputStream(baos.toByteArray()):
     *      字节数组输入流在内存中创建一个字节数组缓冲区，从输入流读取的数据保存在该字节数组缓冲区中。
     * ObjectInputStream :
     *      反序列化流，将之前使用 ObjectOutputStream 序列化的原始数据恢复为对象，以流的方式读取对象。
     */
}























