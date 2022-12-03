package com.ducanh.deviceseller.repository;

import com.ducanh.deviceseller.model.Lecture;
import com.ducanh.deviceseller.repository.projection.CourseItem;
import com.ducanh.deviceseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {
    @Query("SELECT" +
            " l.name AS nameOfLecture, l.link AS link, d.name AS name" +
            " FROM Lecture l LEFT JOIN Course d ON d.id =  l.courseId" +
            " WHERE l.courseId = :courseId")
    List<CourseItem> findAllLectureOfCourse(@Param("courseId") Long courseId);
}
