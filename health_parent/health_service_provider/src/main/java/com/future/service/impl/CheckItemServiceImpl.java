package com.future.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.future.dao.CheckItemDao;
import com.future.pojo.CheckItem;
import com.future.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 检查项服务
 */
@Service
@Transactional
public class CheckItemServiceImpl implements CheckItemService {

    @Autowired
    private CheckItemDao checkItemDao;

    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }
}
