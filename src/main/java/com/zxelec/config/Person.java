package com.zxelec.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Person
 *
 * 使用ConfigurationProperties的优点主要有：
 *  1.支持松散绑定，及配置文件中使用"last_name"、"last-name"都能识别为"lastName"
 *  2.支持JSR-303数据校验
 *  3.支持复杂类型的封装，比如map,list等
 *
 *  确定主要有：
 *  1.不支持spEL表达式
 *
 * @author vimicro
 * @date 2020/10/27
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birthday;

    @Email(message = "邮件格式不正确")
    private String email;

    private Map<String, Object> maps;

    private List<Object> lists;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
