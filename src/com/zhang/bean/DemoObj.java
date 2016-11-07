package com.zhang.bean;

/**
 * Created by Administrator on 2016/11/7.
 */
public class DemoObj {
    private Long id;
    private String name;
    private Short age;

    public DemoObj() {
    }

    public DemoObj(Long id, String name, Short age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DemoObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
