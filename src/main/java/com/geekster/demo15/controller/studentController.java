package com.geekster.demo15.controller;

import com.geekster.demo15.model.Student;
import com.geekster.demo15.repo.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class studentController {

    @Autowired
   private IStudent iStudent;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        iStudent.save(student);
        return "Student added Successfully!!";
    }

    @GetMapping("/getStudent")
    public List<Student> getStudent(){
        return iStudent.findAll();
    }
}
