package com.evolf;

import com.evolf.cap10_AOP.aop.Calculator;
import com.evolf.cap10_AOP.config.Cap10MainConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Cap10Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap10MainConfig.class);
		
		//Calculator c = new Calculator();
		Calculator c = app.getBean(Calculator.class);
		int result = c.div(4, 2);
		System.out.println(result);
		app.close();
	
		
	}
}
