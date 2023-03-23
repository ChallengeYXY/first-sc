package com.yangxinyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com
 * @Date : 2023/3/23 15:10
 * @Author : 星宇
 * @Description :
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yangxinyu.app.mapper")
public class StartAlibabaProvider {
    public static void main(String[] args) {
        SpringApplication.run(StartAlibabaProvider.class,args);
    }
}
