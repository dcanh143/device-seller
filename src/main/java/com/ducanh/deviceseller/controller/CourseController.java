package com.ducanh.deviceseller.controller;

import com.ducanh.deviceseller.model.Course;
import com.ducanh.deviceseller.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> saveCourse(@RequestBody Course course) {
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCourses() {
        return new ResponseEntity<>(courseService.findAllCourses(), HttpStatus.OK);
    }

}
