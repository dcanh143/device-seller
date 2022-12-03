package com.ducanh.deviceseller.service;

import com.ducanh.deviceseller.model.Lecture;
import com.ducanh.deviceseller.model.Purchase;
import com.ducanh.deviceseller.repository.LectureRepository;
import com.ducanh.deviceseller.repository.projection.CourseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureServiceImpl implements LectureService {

    @Autowired
    private LectureRepository lectureRepository;

    @Override
    public Lecture saveLecture(Lecture lecture) {
        return lectureRepository.save(lecture);
    }

    @Override
    public List<CourseItem> findLectureItemOfCourse(Long courseId) {
        return lectureRepository.findAllLectureOfCourse(courseId);
    }
}
