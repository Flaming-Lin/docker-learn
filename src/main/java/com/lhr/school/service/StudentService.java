package com.lhr.school.service;

import com.lhr.school.model.Student;

import java.util.List;

public interface StudentService {

    Student add(Student student);

    void delete(Long studentId);

    Student update(Student student);

    List<Student> getAll();

}
