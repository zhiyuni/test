package com.xiaoyuge.inherit;

import lombok.Data;

@Data
public class Animal {
    private String name;
    private String color;
    private int age;

    public void eat(){
        System.out.println("动物吃");
    }

    public void sleep(){
        System.out.println("动物睡");
    }
}
