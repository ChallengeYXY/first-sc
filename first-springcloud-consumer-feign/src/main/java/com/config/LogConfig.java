package com.config;

import feign.Logger;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @BelongsProject : first-sc
 * @BelongsPackage : com.config
 * @Date : 2023/2/6 15:33
 * @Author : 星宇
 * @Description :
 */
@SpringBootConfiguration
public class LogConfig {
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
