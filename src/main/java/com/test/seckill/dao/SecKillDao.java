package com.test.seckill.dao;

import com.test.seckill.annotation.MybatisAnnotation;
import com.test.seckill.po.SecKill;

import java.util.Date;
import java.util.List;

/**
 * Created by chengwanchao on 2016/7/3.
 */
@MybatisAnnotation
public interface SecKillDao {
    int update(long id);

    SecKill queryById(String  name);

    List<SecKill> queryAll(int offset, int limit);
}
