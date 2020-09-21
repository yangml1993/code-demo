package com.yangml.demo.serializer.pojo;

/**
 * description TODO .
 *
 * @author yangmingliang02
 * @createTime 2020年09月21日 10:24:00
 */
public class DemoSchool extends AbstractSchool implements School{
    @Override
    public String getName() {
        return "demo";
    }
}
