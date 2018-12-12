package com.evolf;

import com.evolf.cap06_Import.config.Cap6MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap6Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap6MainConfig.class);

		System.out.println("IOC容器创建完成........");


		Object bean1 = app.getBean("jamesFactoryBean");
		Object bean2 = app.getBean("jamesFactoryBean");//取Money
		System.out.println("bean的类型="+bean1.getClass());
		System.out.println(bean1 == bean2);

		String[] beanDefinitionNames = app.getBeanDefinitionNames();
		for(String name:beanDefinitionNames){
			System.out.println(name);
		}
		
	}
}