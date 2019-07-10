package com.example.cxt.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BbhClass {

    private Integer id;


    private String name;


    private String teacher;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date openinghours;


    public Date getOpeninghours() {
        return openinghours;
    }

    public void setOpeninghours(Date openinghours) {
        this.openinghours = openinghours;
    }

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
        this.name = name == null ? null : name.trim();
    }


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    @Override
    public String toString() {
        return "BbhClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", openinghours=" + openinghours +
                '}';
    }
}