package com.service;

import com.common.Result;
import com.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.service
 * @Date : 2023/2/6 11:19
 * @Author : 星宇
 * @Description :
 */
@Component
@FeignClient(value = "FIERST-SPRINGCLOUD-PROVIDER")//指定提供者在注册中心的服务名
public interface OrderService {
    @GetMapping("/getStudentById/{id}")
    public Result<Student> getStudentById(@PathVariable(value = "id")Integer id);

    @PostMapping("/addStudent")
    public Result addStudnet(@RequestBody Student student);
}
