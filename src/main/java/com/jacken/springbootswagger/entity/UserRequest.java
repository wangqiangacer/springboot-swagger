package com.jacken.springbootswagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/19 20:09
 */
@ApiModel
public class UserRequest {
    @ApiModelProperty("用户id")
    private  String id;
    @ApiModelProperty("用户名称")
    private  String name;
}
