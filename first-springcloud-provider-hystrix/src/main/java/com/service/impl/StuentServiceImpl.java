package com.service.impl;

import com.yangxinyu.entity.Student;
import com.mapper.StudentMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class StuentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.getStudentById(id);
        return student;
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    @HystrixCommand(fallbackMethod = "timeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="500") //当前方法必须在0.9秒内返回结果，否则视为超时
    })
    @Override
    public Student getStudentByIdTimeout(Integer id){
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.err.println("中断超时方法！");
        }
        return studentMapper.getStudentById(id);
    }

    public Student timeoutHandler(Integer id){
        System.out.println("超时兜底方法！");
        throw new RuntimeException();
    }
}
