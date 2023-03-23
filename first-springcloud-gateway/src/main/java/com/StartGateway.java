package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com
 * @Date : 2023/3/23 9:49
 * @Author : 星宇
 * @Description :
 */
@SpringBootApplication
@EnableEurekaClient
public class StartGateway {
    public static void main(String[] args) {
        SpringApplication.run(StartGateway.class,args);
    }
}
