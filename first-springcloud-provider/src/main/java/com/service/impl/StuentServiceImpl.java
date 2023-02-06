package com.service.impl;

import com.entity.Student;
import com.mapper.StudentMapper;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;
    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.getStudentById(id);
        return student;
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
}
