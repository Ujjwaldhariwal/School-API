package com.api.multipleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.multipleapi.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
