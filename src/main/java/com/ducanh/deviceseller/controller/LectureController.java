package com.ducanh.deviceseller.controller;

import com.ducanh.deviceseller.model.Lecture;
import com.ducanh.deviceseller.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lecture")
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @RequestMapping(value="", method = RequestMethod.POST)
    public ResponseEntity<?> saveLecture(@RequestBody Lecture lecture) {
        return new ResponseEntity<>(lectureService.saveLecture(lecture), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{courseId}", method = RequestMethod.GET)
    public ResponseEntity<?> getAllLectureOfCourse(@PathVariable("courseId") Long courseId) {
        return ResponseEntity.ok(lectureService.findLectureItemOfCourse(courseId));
    }
}
