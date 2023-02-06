package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com
 * @Date : 2023/2/6 11:07
 * @Author : 星宇
 * @Description :
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StartApplicationConsumer {
    public static void main(String[] args) {
        SpringApplication.run(StartApplicationConsumer.class,args);
    }
}
