package com.example.demo.entity;

import java.io.Serializable;

/**
 * Created by zhaoshan on 2018/5/3.
 */
public class Department  implements Serializable {

    private Integer id;

    private String name;

    private String descr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}