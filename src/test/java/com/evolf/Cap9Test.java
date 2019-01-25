package com.evolf;

import com.evolf.cap09_Autowired.config.Cap9MainConfig;
import com.evolf.cap09_Autowired.dao.TestDao;
import com.evolf.cap09_Autowired.service.TestService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap9Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap9MainConfig.class);
		String[] names = app.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}

		TestService testService = app.getBean(TestService.class);
		testService.println();//打印的是service中的testDao2
		//直接从容器中获取TestDao, 和使用Autowired注解来取比较
		TestDao testDao = app.getBean(TestDao.class);//存在testDao  testDao2  不唯一 取出会报错
		System.out.println(testDao);

		//关闭容器
		app.close();
	}
}
