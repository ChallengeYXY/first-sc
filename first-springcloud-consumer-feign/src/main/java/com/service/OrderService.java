package com.service;

import com.common.Result;
import com.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.service
 * @Date : 2023/2/6 11:19
 * @Author : 星宇
 * @Description :
 */
@Component
@FeignClient(value = "FIRST-SPRINGCLOUD-PROVIDER")//指定提供者在注册中心的服务名
public interface OrderService {
    @GetMapping("/student/getStudentById/{id}")
    public Result<Student> getStudentById(@PathVariable(value = "id")Integer id);

    @PostMapping("/student/addStudent")
    public Result addStudnet(@RequestBody Student student);

    @GetMapping("/student/getStudentByIdTimeout/{id}")
    public Result<Student> getStudentByIdTimeout(@PathVariable(value = "id")Integer id);
}
