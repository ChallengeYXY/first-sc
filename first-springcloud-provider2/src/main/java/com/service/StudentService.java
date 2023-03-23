package com.service;

import com.yangxinyu.entity.Student;

public interface StudentService {
    public Student getStudentById(Integer id);

    public void addStudent(Student student);
}
