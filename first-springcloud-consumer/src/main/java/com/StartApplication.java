package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import selfrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "FIRST-SPRINGCLOUD-PROVIDER",configuration = MySelfRule.class)
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class,args);
    }
}
