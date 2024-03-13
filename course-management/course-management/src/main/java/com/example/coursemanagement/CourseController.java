package com.example.coursemanagement.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/create")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @GetMapping("/get")
    public Object getCourse(@RequestParam("role") String role) {
        if (role.equals("student")) {
            return courseService.getAllCoursesForStudents();
        } else if (role.equals("courseCreator")) {
            return courseService.getAllCoursesForCourseCreator();
        } else {
            return "Invalid role";
        }
    }
}
