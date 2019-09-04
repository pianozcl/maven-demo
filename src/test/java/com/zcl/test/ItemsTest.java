package com.zcl.test;

import com.zcl.dao.ItemsDao;
import com.zcl.domain.Items;
import com.zcl.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void findById(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ItemsDao itemsDao=ac.getBean(ItemsDao.class);
//
//        Items items = itemsDao.findById(1);
//        System.out.println(items);

        ItemService itemService = ac.getBean(ItemService.class);
        Items items = itemService.findById(1);
        System.out.println(items);
    }
}
