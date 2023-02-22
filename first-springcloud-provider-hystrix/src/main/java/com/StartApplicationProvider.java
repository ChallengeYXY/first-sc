package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com
 * @Date : 2023/2/21 13:58
 * @Author : 星宇
 * @Description :
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class StartApplicationProvider {
    public static void main(String[] args) {
        SpringApplication.run(StartApplicationProvider.class,args);
    }
}
