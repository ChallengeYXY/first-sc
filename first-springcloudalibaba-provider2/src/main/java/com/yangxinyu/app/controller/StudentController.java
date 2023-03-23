package com.yangxinyu.app.controller;

import com.yangxinyu.common.Result;
import com.yangxinyu.entity.Student;
import com.yangxinyu.app.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.yangxinyu.app.controller
 * @Date : 2023/3/23 15:28
 * @Author : 星宇
 * @Description :
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getStudentById/{id}")
    public Result<Student> getStudentById(@PathVariable Integer id){
        Student student = studentService.getStudentById(id);
        return new Result<>(200,port+"请求成功！",student);
    }
}
