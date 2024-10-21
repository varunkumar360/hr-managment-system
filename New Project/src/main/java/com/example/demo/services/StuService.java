package com.example.demo.services;

import com.example.demo.model.Student;

import java.util.List;

public interface StuService {
    public Student savestudent(Student student);
    public List<Student> getAllStudent();


}
