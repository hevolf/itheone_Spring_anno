package com.evolf.cap11_Transactional.service;

import com.evolf.cap11_Transactional.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author caohaifengx@163.com 2019-03-23 22:50
 */
@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void addOrder(){
        orderDao.insert();
        System.out.println("操作成功");
        int a = 1/0;
    }
}
