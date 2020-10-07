package com.lhr.school.service;

import com.lhr.school.dao.StudentDataBase;
import com.lhr.school.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public Student add(Student student) {
        if (null == student || null == student.getStudentId()) {
            throw new RuntimeException("入参不可为空！");
        }

        List<Student> students = StudentDataBase.getAll();
        if (students.stream().anyMatch(data -> data.getStudentId().equals(student.getStudentId()))) {
            throw new RuntimeException("该 ID 已经存在！");
        }

        return StudentDataBase.add(student);
    }

    @Override
    public void delete(Long studentId) {
        if (null == studentId) {
            throw new RuntimeException("入参不可为空！");
        }

        StudentDataBase.delete(studentId);
    }

    @Override
    public Student update(Student student) {
        if (null == student || null == student.getStudentId()) {
            throw new RuntimeException("入参不可为空！");
        }

        return StudentDataBase.update(student);
    }

    @Override
    public List<Student> getAll() {
        return StudentDataBase.getAll();
    }
}
