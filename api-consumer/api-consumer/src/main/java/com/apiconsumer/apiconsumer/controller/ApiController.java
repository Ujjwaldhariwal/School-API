package com.apiconsumer.apiconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiconsumer.apiconsumer.Course;
import com.apiconsumer.apiconsumer.Student;
import com.apiconsumer.apiconsumer.Teacher;
import com.apiconsumer.apiconsumer.service.ApiService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return apiService.getStudents();
    }

    @GetMapping("/teachers")
    public List<Teacher> getTeachers() {
        return apiService.getTeachers();
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return apiService.getCourses();
    }
}
