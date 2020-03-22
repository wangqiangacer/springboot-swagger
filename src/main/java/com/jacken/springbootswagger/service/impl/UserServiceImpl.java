package com.jacken.springbootswagger.service.impl;

import com.jacken.springbootswagger.entity.User;
import com.jacken.springbootswagger.entity.UserRequest;
import com.jacken.springbootswagger.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/19 20:11
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(UserRequest request) {
        User user = new User();
        user.setId("1");
        user.setName("xiaoming");
        return user;
    }
}
