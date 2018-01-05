package com.example.suhu.dbproect;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

/**
 * @author suhu
 * @data 2018/1/5.
 * @description
 */

public class People extends DataSupport {
    @Column(unique = true,defaultValue = "unKnown")
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
