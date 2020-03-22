package com.jacken.springbootswagger.service;

import com.jacken.springbootswagger.entity.User;
import com.jacken.springbootswagger.entity.UserRequest;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/19 20:11
 */
public interface UserService {

    User getUser(UserRequest request);
}
