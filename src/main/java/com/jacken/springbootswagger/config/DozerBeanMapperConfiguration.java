package com.jacken.springbootswagger.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/21 16:36
 */
@Configuration
public class DozerBeanMapperConfiguration {

    @Bean
    public DozerBeanMapper mapper(){
        return new DozerBeanMapper();
    }
}
