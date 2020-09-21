package com.yangml.demo.serializer.kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.google.common.collect.Lists;
import com.yangml.demo.serializer.Serializer;
import com.yangml.demo.serializer.pojo.DemoSchool;
import com.yangml.demo.serializer.pojo.School;
import com.yangml.demo.serializer.pojo.TestSchool;
import com.yangml.demo.serializer.pojo.User;

import java.util.List;

/**
 * @Time : 2020/9/20 10:41 PM
 * @Author : yangmingliang[yangmingliang@souche.com]
 * @CopyRight : DataTeam @ SouChe Inc
 * @Desc : Kyro序列化实现类
 */
public class KryoSerializer implements Serializer {
    private Class<?> ct = null;
    public KryoSerializer(Class<?> ct){
        this.ct = ct;
    }
    public void serialize(Object t, byte[] bytes) {
        Kryo kryo = new Kryo();
        Output output = new Output();
        output.setBuffer(bytes);
        kryo.writeObjectOrNull(output,t,t.getClass());
        output.flush();
    }

    public <T> T deserialize(byte[] bytes) {
        Kryo kryo = new Kryo();
        Input input = new Input();
        input.setBuffer(bytes,0,bytes.length);
        return (T)kryo.readObjectOrNull(input,ct);
    }


    public static void main(String[] args) {
        School testSchool = new TestSchool();
        School demoSchool = new DemoSchool();
        List<School> schoolList = Lists.newArrayList(testSchool,demoSchool);
        User user = User.builder().name("杨明亮").age(26).school(schoolList).build();
        KryoSerializer kryoSerializer = new KryoSerializer(User.class);
        byte[] bytes = new byte[200];
        kryoSerializer.serialize(user,bytes);
        User result = kryoSerializer.deserialize(bytes);
        System.out.println(result.toString());
        System.out.println(result.getSchool().get(0).getName());
        System.out.println(result.getSchool().get(1).getName());
    }
}
