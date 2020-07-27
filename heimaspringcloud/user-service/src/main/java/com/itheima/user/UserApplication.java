package com.itheima.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author kpwang
 * @create 2020-07-27 20:50
 */
@SpringBootApplication
@MapperScan("com.itheima.user.mapper")
@EnableDiscoveryClient//开启eureka客户端发现功能
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
