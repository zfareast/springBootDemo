package com.example.springBootDemo.domain;

/**
 * Created by Administrator on 2018/11/13.
 */
public class User {
    private Long id;

    private String name;

    private Integer age;

    public User() {
        // 无参默认构造器
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + "'" +
                ", age=" + age +
                "}";
    }
}
