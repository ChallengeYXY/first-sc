package com.controller;

import com.yangxinyu.common.Result;
import com.yangxinyu.entity.Student;
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


    @GetMapping("/getStudentByIdTimeout/{id}")
    public Result<Student> getStudentByIdTimeout(@PathVariable(value = "id")Integer id){
        System.out.println("进入超时方法！");
        try {
            Student student = studentService.getStudentByIdTimeout(id);
            return new Result<Student>(200,port+"查询成功！",student);
        } catch (RuntimeException e){
            return new Result<>(500,port+"服务器繁忙");
        }catch (Exception e) {
            return new Result<>(500,port+"服务器错误！");
        }
    }
}
