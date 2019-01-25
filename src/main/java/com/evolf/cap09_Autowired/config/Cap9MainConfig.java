package com.evolf.cap09_Autowired.config;

import com.evolf.cap09_Autowired.dao.TestDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.evolf.cap09_Autowired.controller", "com.evolf.cap09_Autowired.service", "com.evolf.cap09_Autowired.dao"})
public class Cap9MainConfig {
	//spring进行自装配的时候默认首选的bean
	//@Primary
	@Bean("testDao2")
	public TestDao testDao(){
		TestDao testDao = new TestDao();
		testDao.setFlag("2");
		return testDao;
	}
}
