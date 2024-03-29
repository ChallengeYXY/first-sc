package com.controller;

import com.yangxinyu.common.Result;
import com.yangxinyu.entity.Student;
import com.service.OrderService;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.controller
 * @Date : 2023/2/6 13:52
 * @Author : 星宇
 * @Description :
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/student/getStudentById/{id}")
    public Result<Student> getStudentById(@PathVariable(value = "id")Integer id){
        return orderService.getStudentById(id);
    }
    @PostMapping("/student/addStudent")
    public Result addStudnet(@RequestBody Student student){
        return orderService.addStudnet(student);
    }

    @GetMapping("/student/getStudentByIdTimeout/{id}")
    public Result<Student> getStudentByIdTimeout(@PathVariable(value = "id")Integer id){
        return orderService.getStudentByIdTimeout(id);
    }
}
