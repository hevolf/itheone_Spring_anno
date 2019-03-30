package com.evolf;

import com.evolf.cap10_AOP.config.Cap10MainConfig;
import com.evolf.cap11_Transactional.config.Cap11MainConfig;
import com.evolf.cap11_Transactional.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author caohaifengx@163.com 2019-03-23 22:53
 */
public class Cap11Test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap11MainConfig.class);
        OrderService orderService = app.getBean(OrderService.class);
        orderService.addOrder();
        app.close();

    }
}
