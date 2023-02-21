package com.controller;

import com.common.Result;
import com.entity.Student;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
@RequestMapping("/consumer")
public class OrderController {

    //private final String providerURL = "http://localhost:8001";
    private final String providerURL = "http://FIRST-SPRINGCLOUD-PROVIDER";

    @Resource
    private RestTemplate restTemplate;


    @PostMapping("/student/addStudent")
    public Result add(@RequestBody Student student){
        return restTemplate.postForObject(providerURL+"/student/addStudent",student,Result.class);
    }


    @GetMapping("/student/getStudentById/{id}")
    public Result getStudentById(@PathVariable(value = "id")Integer id){
        System.out.println("请求成功！");
        return restTemplate.getForObject(providerURL+"/student/getStudentById/"+id,Result.class);
    }
}
