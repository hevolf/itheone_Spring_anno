package com.evolf;

import com.evolf.cap03_Scope.config.Cap3MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Cap3Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //单例 多例测试
        Object bean1 = app.getBean("person");
        Object bean2 = app.getBean("person");
        System.out.println(bean1 == bean2);


    }
}
