package com.evolf;

import com.evolf.cap05_Condition.config.Cap5MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap5Test {
	//@Test
	//public void test01(){
	//	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
	//
	//	System.out.println("IOC容器创建完成........");
	//	String[] beanNamesForType = app.getBeanNamesForType(Person.class);
	//	for (String s : beanNamesForType) {
	//		System.out.println(s);
	//	}
	//	Map<String, Person> personBean = app.getBeansOfType(Person.class);
	//	System.out.println(personBean);
	//
	//}

	@Test
	public void test02(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap5MainConfig.class);
		System.out.println("IOC容器创建完成........");
		ConfigurableEnvironment environment = app.getEnvironment();
		String property = environment.getProperty("os.name");
		System.out.println(property);
	}
}
