package com.apiconsumer.apiconsumer;

import java.util.List;

public class Course {

    private Long id;
    private String name;
    private List<Long> studentIds;

    public Course() {
    }

    public Course(Long id, String name, List<Long> studentIds) {
        this.id = id;
        this.name = name;
        this.studentIds = studentIds;
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

    public List<Long> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Long> studentIds) {
        this.studentIds = studentIds;
    }
}
