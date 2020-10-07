package com.lhr.school.controller;

import com.lhr.school.model.Student;
import com.lhr.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student add(@RequestBody Student student) {
        return studentService.add(student);
    }

    @DeleteMapping("/student")
    public void delete(@RequestBody Long studentId) {
        studentService.delete(studentId);
    }

    @PutMapping("/student")
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @GetMapping("/student")
    public List<Student> getAll() {
        return studentService.getAll();
    }

}
