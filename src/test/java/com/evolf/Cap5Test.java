package com.evolf;

import com.evolf.cap01.Person;
import com.evolf.cap05.config.Cap5MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Cap5Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
		
		System.out.println("IOC容器创建完成........");
		String[] beanNamesForType = app.getBeanNamesForType(Person.class);
		for (String s : beanNamesForType) {
			System.out.println(s);
		}
		Map<String, Person> personBean = app.getBeansOfType(Person.class);
		System.out.println(personBean);

	}
}
