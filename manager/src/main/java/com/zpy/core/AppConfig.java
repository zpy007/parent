package com.zpy.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ZBeans myBeans(){
        return new ZBeans();
    }
}
