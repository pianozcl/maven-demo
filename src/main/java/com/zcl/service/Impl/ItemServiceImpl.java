package com.zcl.service.Impl;

import com.zcl.dao.ItemsDao;
import com.zcl.domain.Items;
import com.zcl.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
