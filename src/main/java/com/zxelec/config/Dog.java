package com.zxelec.config;

import java.util.List;

/**
 * Dog
 *
 * @author vimicro
 * @date 2020/10/27
 */
public class Dog {

    private String name;

    private Integer age;

    private List<String> color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
