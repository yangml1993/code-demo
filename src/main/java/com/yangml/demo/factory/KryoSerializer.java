package com.yangml.demo.factory;

/**
 * description TODO .
 *
 * @author yangmingliang02
 * @createTime 2020年09月23日 11:37:00
 */
public class KryoSerializer implements Serializer{
    private static KryoSerializer instance = null;
    public static KryoSerializer getInstance(){
        if(instance != null){
            return instance;
        }
        synchronized (KryoSerializer.class){
            instance = new KryoSerializer();
        }
        return instance;
    }
    public byte[] serialize(Object o) {
        return new byte[0];
    }

    public <T> T deserialize(byte[] bytes) {
        return null;
    }
}
