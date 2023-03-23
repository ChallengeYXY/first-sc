package com.yangxinyu.app.service;

import com.yangxinyu.common.Result;
import com.yangxinyu.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.yangxinyu
 * @Date : 2023/3/23 16:39
 * @Author : 星宇
 * @Description :
 */
@Service
@FeignClient(value = "first-springcloudalibaba-provider",path = "/student")
public interface StudentOrderService {
    @GetMapping("/getStudentById/{id}")
    Result<Student> getStudentById(@PathVariable Integer id);
}
