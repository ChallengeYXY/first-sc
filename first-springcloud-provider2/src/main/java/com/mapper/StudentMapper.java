package com.mapper;

import com.yangxinyu.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    public Student getStudentById(Integer id);

    public void addStudent(Student student);

}
