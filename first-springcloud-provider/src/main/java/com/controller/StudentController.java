package com.controller;

import com.common.Result;
import com.entity.Student;
import com.service.StudentService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/getStudentById/{id}")
    public Result<Student> getStudentById(@PathVariable(value = "id")Integer id){
        try {
            Student student = studentService.getStudentById(id);
            return new Result<Student>(200,port+"查询成功！",student);
        } catch (Exception e) {
            return new Result<>(500,port+"查询失败！");
        }
    }

    @PostMapping("/addStudent")
    public Result addStudnet(@RequestBody Student student){
        try {
            studentService.addStudent(student);
            return new Result(200,port+"添加成功！");
        } catch (Exception e) {
            return new Result(500,port+"添加失败！");
        }

    }
}
