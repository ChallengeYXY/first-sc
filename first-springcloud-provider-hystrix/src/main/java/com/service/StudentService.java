package com.service;

import com.entity.Student;

public interface StudentService {
    public Student getStudentById(Integer id);

    public void addStudent(Student student);

    Student getStudentByIdTimeout(Integer id);

}
