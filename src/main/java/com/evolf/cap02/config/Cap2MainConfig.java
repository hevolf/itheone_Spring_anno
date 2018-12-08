package com.evolf.cap02.config;

import com.evolf.cap01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//扫描所有组件 service controller 等等
@ComponentScan(value = "com.evolf.cap02")
public class Cap2MainConfig {
    ////给容器中注册一个bean, 类型为返回值的类型, beanId名称未指定时默认为方法名
    @Bean
    public Person person02(){
        return new Person("caohaifeng", 20);
    }
}
