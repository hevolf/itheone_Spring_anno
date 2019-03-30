package com.evolf.cap12_PostProcessor;

import com.evolf.cap09_Autowired.bean.Moon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author caohaifengx@163.com 2019-03-24 20:55
 */

@Configuration
@ComponentScan("com.evolf.cap12_PostProcessor.processor")
public class Cap12MainConfig {
    @Bean
    public Moon getMoon(){
        return new Moon();
    }
}
