package com.ducanh.deviceseller.repository;

import com.ducanh.deviceseller.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository
        extends JpaRepository<Course, Long> {

}
