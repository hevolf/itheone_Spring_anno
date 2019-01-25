package com.evolf.cap09_Autowired.service;

import com.evolf.cap09_Autowired.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Autowired 默认优先按类型去容器中找对应的组件,相当于anno.getBean(TestDao.class)去容器获取id为testDao的bean
//@Autowired 作用：从容器中找对应bean
@Service

public class TestService {
	@Qualifier("testDao2")
	@Autowired
	//@Qualifier("testDao")
	//@Autowired(required=false)
	//@Resource(name="testDao2")
	//@Resource效果是一样的,与Autowired一样可以装配bean
	//1,不支持Primary功能
	//2,不支持Autowired false
	//@Inject
	//1,支持Primary功能
	//2,不支持Autowired false
	private TestDao testDao;

	public void println(){
		System.out.println(testDao);
	}
}
