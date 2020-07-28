package com.itheima.consumer.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kpwang
 * @create 2020-07-28 15:13
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        //记录所有请求和响应的明细
        return Logger.Level.FULL;
    }
}
