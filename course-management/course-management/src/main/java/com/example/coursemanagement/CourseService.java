package com.example.coursemanagement.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCoursesForStudents() {
        // Logic to fetch courses for students
        return courseRepository.findAll();
    }

    public List<Course> getAllCoursesForCourseCreator() {
        // Logic to fetch courses for course creators
        return courseRepository.findAll();
    }
}
