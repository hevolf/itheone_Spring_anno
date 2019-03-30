package com.evolf.cap06_Import.config;

import com.evolf.cap06_Import.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author pc-Fy
 * FactoryBean 注入bean
 * anno.getBean("jamesFactoryBean")实际是获取getObject创建的对象, 并不是jamesFactoryBean对象
 * 当声明Object bean1 = anno.getBean("&jamesFactoryBean");, 获取到的bean为jamesFactoryBean对象
 *
 * factorybean  可以对普通bena进行个性化定制
 */
public class JamesFactoryBean implements FactoryBean<Monkey>{

	@Override
	public Monkey getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Monkey();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Monkey.class;
	}
	
	@Override
	public boolean isSingleton() {
		return true;
	}
}
