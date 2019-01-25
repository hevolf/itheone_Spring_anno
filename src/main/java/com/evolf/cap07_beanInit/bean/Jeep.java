package com.evolf.cap07_beanInit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @PostConstruct  初始化
 * @PreDestroy	销毁
 */

import org.springframework.stereotype.Component;
@Component
public class Jeep {
	public Jeep(){
		System.out.println("Jeep.....constructor........");
	}
	@PostConstruct
	public void init(){
		System.out.println("Jeep.....@PostConstruct........");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("Jeep.....@PreDestroy......");
	}
}
