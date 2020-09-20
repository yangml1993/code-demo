package com.yangml.demo.serializer;

/**
 * @Time : 2020/9/20 10:40 PM
 * @Author : yangmingliang[yangmingliang@souche.com]
 * @CopyRight : DataTeam @ SouChe Inc
 * @Desc :
 */
public interface Serializer {
    /**
     * 序列化接口
     * @param t
     * @param bytes
     */
    public void serialize(Object t,byte[] bytes);


    /**
     * 反序列化接口
     * @param bytes
     * @param <T>
     * @return
     */
    public <T>T deserialize(byte[] bytes);
}
