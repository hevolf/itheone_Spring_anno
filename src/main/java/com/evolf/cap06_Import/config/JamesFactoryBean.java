package com.evolf.cap06_Import.config;

import com.evolf.cap06_Import.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

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
