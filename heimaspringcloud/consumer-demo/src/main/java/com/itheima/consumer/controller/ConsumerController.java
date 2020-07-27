package com.itheima.consumer.controller;

import com.itheima.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author kpwang
 * @create 2020-07-27 21:26
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping("{id}")
    public User queryById(@PathVariable Long id){
        //String url="http://localhost:9091/user/8";
        //获取eureka中注册的user-service实例
        /*List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance = instances.get(0);
        String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;*/


        String url="http://user-service/user/"+id;
        return restTemplate.getForObject(url, User.class);
    }
}
