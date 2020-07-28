package com.itheima.user.controller;

import com.itheima.user.service.UserService;
import com.itheima.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kpwang
 * @create 2020-07-27 21:02
 */
@RestController
@RequestMapping("/user")
@RefreshScope//刷新配置
public class UserController {
    @Value("${test.name}")
    private String name;
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id){
        /*try {
            Thread.sleep(2000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("配置文件中的test.name为："+name);
        return userService.queryById(id);
    }
}
