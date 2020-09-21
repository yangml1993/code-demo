package com.yangml.demo.serializer.pojo;

/**
 * @Time : 2020/9/20 11:16 PM
 * @Author : yangmingliang[yangmingliang@souche.com]
 * @CopyRight : DataTeam @ SouChe Inc
 * @Desc :
 */
public class TestSchool extends AbstractSchool implements School{
    @Override
    public String getName() {
        return "test";
    }
}
