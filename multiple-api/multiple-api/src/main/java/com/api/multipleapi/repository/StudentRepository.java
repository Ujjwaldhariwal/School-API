package com.api.multipleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multipleapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
