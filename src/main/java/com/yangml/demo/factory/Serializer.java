package com.yangml.demo.factory;

/**
 * description 序列化接口
 *
 * @author yangmingliang02
 * @createTime 2020年09月23日 09:58:00
 */
public interface Serializer {
    /**
     * 序列化
     * @param o
     * @return
     */
    byte[] serialize(Object o);

    /**
     * 反序列化
     * @param bytes
     * @param <T>
     * @return
     */
    <T>T deserialize(byte[] bytes);

}
