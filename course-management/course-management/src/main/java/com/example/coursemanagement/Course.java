package com.example.coursemanagement.course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;
    private int chapters;
    private int noOfClasses;
    private CourseType type;
    private LearnMode learnMode;

    // Constructors, Getters, Setters
}
