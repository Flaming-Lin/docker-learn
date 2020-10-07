package com.lhr.school.dao;

import com.lhr.school.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDataBase {

    private static Map<Long, Student> studentDatas = new HashMap<>();

    public static Student add(Student student) {
        if (null == student || null == student.getStudentId()) {
            throw new RuntimeException("入参不可为空！");
        }

        synchronized (StudentDataBase.class) {
            studentDatas.put(student.getStudentId(), student);
        }
        return student;
    }

    public static List<Student> getAll() {
        synchronized (StudentDataBase.class) {
            return new ArrayList<>(studentDatas.values());
        }
    }

    public static void delete(Long studentId) {
        if (null == studentId) {
            return;
        }

        synchronized (StudentDataBase.class) {
            studentDatas.remove(studentId);
        }
    }

    public static Student update(Student student) {
        if (null == student || null == student.getStudentId()) {
            throw new RuntimeException("入参不可为空！");
        }

        synchronized (StudentDataBase.class) {
            studentDatas.put(student.getStudentId(), student);
        }
        return student;
    }

}
