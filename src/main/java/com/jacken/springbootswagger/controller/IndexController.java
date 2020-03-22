package com.jacken.springbootswagger.controller;

import com.jacken.springbootswagger.entity.User;
import com.jacken.springbootswagger.entity.UserRequest;
import com.jacken.springbootswagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/19 20:06
 */
@RestController
@Api(value = "用户相关接口")
@RequestMapping("/user")
public class IndexController {

    @Autowired
    private UserService userService;

    @Value("${user.password}")
    private String password;

    @Value("${user.name}")
    private String name;


    @PostMapping("/getUser")
    @ApiOperation("查询用户信息")
    public User getUser(@RequestBody UserRequest request){
        return userService.getUser(request);
    }


    @GetMapping("/getUserPassword")
    @ApiOperation("获取用户密码")
    public String getUserPassword(){
        return name+":"+password;
    }
}
