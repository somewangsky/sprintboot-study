package com.zxelec.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * Teacher
 *
 * @author vimicro
 * @Value 的方式主要有如下优点：
 * 1.支持spEL表达式
 * 2.简单方便
 * <p>
 * 缺点如下：
 * 1.不能操作复杂类型
 * 2.不能对数据进行校验
 * 3.不支持松散绑定
 * @date 2020/10/27
 */
@Component
public class Teacher {

    @Value("${teacher.name}")
    private String name;

    @Value("#{30-12}")
    private Integer age;

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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
