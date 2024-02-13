package com.apiconsumer.apiconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apiconsumer.apiconsumer.Course;
import com.apiconsumer.apiconsumer.Student;
import com.apiconsumer.apiconsumer.Teacher;

import java.util.List;

@Service
public class ApiService {

    @Value("${api.server.url}")
    private String apiServerUrl;

    @Autowired
    private RestTemplate restTemplate;

    public List<Student> getStudents() {
        String studentUrl = apiServerUrl + "/students";
        ResponseEntity<List<Student>> studentsResponse = restTemplate.exchange(studentUrl, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Student>>() {});
        return studentsResponse.getBody();
    }

    public List<Teacher> getTeachers() {
        String teacherUrl = apiServerUrl + "/teachers";
        ResponseEntity<List<Teacher>> teachersResponse = restTemplate.exchange(teacherUrl, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Teacher>>() {});
        return teachersResponse.getBody();
    }

    public List<Course> getCourses() {
        String courseUrl = apiServerUrl + "/courses";
        ResponseEntity<List<Course>> coursesResponse = restTemplate.exchange(courseUrl, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Course>>() {});
        return coursesResponse.getBody();
    }
}

