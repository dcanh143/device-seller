package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Lecture;
import com.ducanh.deviceseller.repository.projection.CourseItem;

import java.util.List;

public interface LectureService {

    Lecture saveLecture(Lecture lecture);

    List<CourseItem> findLectureItemOfCourse(Long userId);
}
