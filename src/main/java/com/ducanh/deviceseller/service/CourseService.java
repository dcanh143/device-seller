package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    void deleteCourse(Long id);

    List<Course> findAllCourses();
}
