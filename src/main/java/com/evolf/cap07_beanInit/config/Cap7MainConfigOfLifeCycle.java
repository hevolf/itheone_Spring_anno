package com.evolf.cap07_beanInit.config;

import com.evolf.cap01_conf.Person;
import com.evolf.cap07_beanInit.bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.evolf.cap07_beanInit.bean")
@Configuration
public class Cap7MainConfigOfLifeCycle {
	@Bean("person")
	public Person person(){
		System.out.println("给容器中添加person.......");
		return new Person("person",20);
	}

	//指定init和destory方法
	@Bean(initMethod="init", destroyMethod="destory")
	public Bike bike(){
		return new Bike();
	}

}
