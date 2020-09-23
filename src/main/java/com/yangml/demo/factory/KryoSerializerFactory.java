package com.yangml.demo.factory;

/**
 * description TODO .
 *
 * @author yangmingliang02
 * @createTime 2020年09月23日 11:23:00
 */
public class KryoSerializerFactory implements SerializerFactory{

    public Serializer getSerializer() {
        return KryoSerializer.getInstance();
    }
}
