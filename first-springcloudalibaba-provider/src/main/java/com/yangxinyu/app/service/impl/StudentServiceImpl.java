package com.yangxinyu.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yangxinyu.app.mapper.StudentMapper;
import com.yangxinyu.app.service.StudentService;
import com.yangxinyu.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.yangxinyu.app.service.impl
 * @Date : 2023/3/23 15:29
 * @Author : 星宇
 * @Description :
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.selectOne(new LambdaQueryWrapper<Student>()
                .eq(Student::getId, id));
        return student;
    }
}
