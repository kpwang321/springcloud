package com.itheima.consumer.fallback;

import com.itheima.consumer.client.UserClient;
import com.itheima.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author kpwang
 * @create 2020-07-28 15:06
 */
@Component
public class UserClientFallback implements UserClient{
    @Override
    public User queryById(Long id) {
        User user=new User();
        user.setId(id);
        user.setName("用户异常");
        return user;
    }
}
