package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.services.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StuService stuService;

    @PostMapping("/add")
    public List<Student> add(@RequestBody Student student){
        stuService.savestudent(student);
        return stuService.getAllStudent();
    }

    @GetMapping("/getall")
    public List<Student> getAllStudent(){
         return stuService.getAllStudent();
    }


}
