package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Course;
import com.ducanh.deviceseller.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course device) {
        device.setCreateTime(LocalDateTime.now());
        return courseRepository.save(device);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }
}
