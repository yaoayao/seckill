package com.test.seckill.service.impl;

import com.test.seckill.dao.SecKillDao;
import com.test.seckill.po.SecKill;
import com.test.seckill.service.SecKillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chengwanchao on 2016/8/31.
 */
@Service
public class SecKillServiceImpl implements SecKillService {
    @Resource
    private SecKillDao secKillDao;


    @Override
    public void query(long id) {
        secKillDao.queryById("111");
        return;
    }
}
