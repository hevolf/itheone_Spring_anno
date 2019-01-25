package com.evolf.cap07_beanInit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//ApplicationContextAware
@Component
public class Plane implements ApplicationContextAware{
	private ApplicationContext applicationContext;
	public Plane(){
		System.out.println("Plane.....constructor........");
	}
	@PostConstruct
	public void init(){
		System.out.println("Plane.....@PostConstruct........");
	}

	@PreDestroy
	public void destory(){
		System.out.println("Plane.....@PreDestroy......");
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		//容器初始化，将applicationContext传进来，那么其他方法就可以使用IOC容器
		//将applicationContext传进来,可以拿到
		this.applicationContext = applicationContext;
	}
}
