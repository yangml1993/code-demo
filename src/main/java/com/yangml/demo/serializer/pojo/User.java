package com.yangml.demo.serializer.pojo;

import lombok.*;

import java.util.List;

/**
 * @Time : 2020/9/20 11:01 PM
 * @Author : yangmingliang[yangmingliang@souche.com]
 * @CopyRight : DataTeam @ SouChe Inc
 * @Desc :
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private List<School> school;
}
