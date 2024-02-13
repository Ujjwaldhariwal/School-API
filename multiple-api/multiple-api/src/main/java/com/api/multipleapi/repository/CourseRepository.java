// CourseRepository.java
package com.api.multipleapi.repository;

import com.api.multipleapi.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    // You can add custom queries or methods if needed
}
