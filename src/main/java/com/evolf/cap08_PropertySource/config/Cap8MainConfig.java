package com.evolf.cap08_PropertySource.config;

import com.evolf.cap08_PropertySource.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource(value="classpath:/test.properties")
public class Cap8MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }
}
