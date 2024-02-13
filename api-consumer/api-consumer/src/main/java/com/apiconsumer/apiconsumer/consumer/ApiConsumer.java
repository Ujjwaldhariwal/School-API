package com.apiconsumer.apiconsumer.consumer;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apiconsumer.apiconsumer.Student;
import com.apiconsumer.apiconsumer.Teacher;

import jakarta.annotation.PostConstruct;

import com.apiconsumer.apiconsumer.Course;


@Service
public class ApiConsumer {

    @Value("${api.server.url}")
    private String apiServerUrl;

    @PostConstruct
    public void consumer() {
    	System.out.println("Resolved apiServerUrl: " + apiServerUrl);
        // Consume /getStudent endpoint
        consumeStudentApi();

        // Consume /getTeachers endpoint
        consumeTeacherApi();

        // Consume /getCourses endpoint
        consumeCourseApi();
    }

    public void consumeStudentApi() {
        String studentUrl = apiServerUrl + "/students";
        System.out.println("Consuming Student API at: " + studentUrl);
        RestTemplate template = new RestTemplate();
        ResponseEntity<List<Student>> students = template.exchange(studentUrl, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Student>>() {});
        List<Student> studentList = students.getBody();
        System.out.println("Size of Students: " + studentList.size());
        if (studentList.size() > 0) {
            for (Student st : studentList) {
                System.out.println("Student - id: " + st.getId() + ", name: " + st.getName());
            }
        }
    }

    public void consumeTeacherApi() {
        String teacherUrl = apiServerUrl + "/teachers";
        System.out.println("Consuming teacher API at: " + teacherUrl);
        RestTemplate template = new RestTemplate();
        ResponseEntity<List<Teacher>> teachers = template.exchange(teacherUrl, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Teacher>>() {});
        List<Teacher> teacherList = teachers.getBody();
        System.out.println("Size of Teachers: " + teacherList.size());
        if (teacherList.size() > 0) {
            for (Teacher teacher : teacherList) {
                System.out.println("Teacher - id: " + teacher.getId() + ", name: " + teacher.getName());
            }
        }
    }

    public void consumeCourseApi() {
        String courseUrl = apiServerUrl + "/courses";
        System.out.println("Consuming Course API at: " + courseUrl);
        RestTemplate template = new RestTemplate();
        ResponseEntity<List<Course>> courses = template.exchange(courseUrl, HttpMethod.GET, HttpEntity.EMPTY,
                new ParameterizedTypeReference<List<Course>>() {});
        List<Course> courseList = courses.getBody();
        System.out.println("Size of Courses: " + courseList.size());
        if (courseList.size() > 0) {
            for (Course course : courseList) {
                System.out.println("Course - id: " + course.getId() + ", name: " + course.getName());
            }
        }
    }
}
