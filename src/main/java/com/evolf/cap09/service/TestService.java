package com.evolf.cap09.service;

import javax.annotation.Resource;
import javax.inject.Inject;

import com.evolf.cap09.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	@Qualifier("testDao2")
	@Autowired
	//@Qualifier("testDao")
	//@Autowired(required=false)
	//效果是一样的,与Autowired一样可以装配bean
	//1,不支持Primary功能
	//2,不支持Autowired false
	//@Resource(name="testDao2")
	//@Inject
	private TestDao testDao;

	public void println(){
		System.out.println(testDao);
	}
}
