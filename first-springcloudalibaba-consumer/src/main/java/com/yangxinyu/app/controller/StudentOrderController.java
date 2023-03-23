package com.yangxinyu.app.controller;

import com.yangxinyu.app.service.StudentOrderService;
import com.yangxinyu.common.Result;
import com.yangxinyu.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.yangxinyu.app.controller
 * @Date : 2023/3/23 16:43
 * @Author : 星宇
 * @Description :
 */
@RestController
@RequestMapping("/consumer/student")
public class StudentOrderController {
    @Resource
    private StudentOrderService studentOrderService;
    @GetMapping("/getStudentById/{id}")
    public Result<Student> getStudentById(@PathVariable Integer id){
        return studentOrderService.getStudentById(id);
    }
}
