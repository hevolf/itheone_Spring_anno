package com.evolf;

import com.evolf.cap08_PropertySource.bean.Bird;
import com.evolf.cap08_PropertySource.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap8Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
		//从容器中获取所有bean
		String[] names = app.getBeanDefinitionNames();

		for(String name:names){
			System.out.println(name);
		}
		Bird bird = (Bird) app.getBean("bird");

		System.out.println(bird);
		System.out.println("IOC容器创建完成........");

		//properties 会加载到环境变量中，可以直接从环境变量中取值
		ConfigurableEnvironment environment = app.getEnvironment();
		System.out.println("environment===="+environment.getProperty("bird.color"));
		app.close();


	}
}