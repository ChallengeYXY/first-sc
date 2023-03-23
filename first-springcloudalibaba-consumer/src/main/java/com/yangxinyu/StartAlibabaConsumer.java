package com.yangxinyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.yangxinyu
 * @Date : 2023/3/23 16:27
 * @Author : 星宇
 * @Description :
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//公共模块依赖了mybatis-plus，springboot默认必须进行配置，进行排除一下配置类
@EnableDiscoveryClient
@EnableFeignClients
public class StartAlibabaConsumer {
    public static void main(String[] args) {
        SpringApplication.run(StartAlibabaConsumer.class,args);
    }
}
