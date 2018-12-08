package com.evolf.cap01.config;

import com.evolf.cap01.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类------配置文件
@Configuration
public class MainConfig {
    ////给容器中注册一个bean, 类型为返回值的类型, beanId名称未指定时默认为方法名
    @Bean("person2")
    public Person person02(){
        return new Person("caohaifeng", 20);
    }
}
