package com.test.seckill.dao;

import com.test.seckill.annotation.MybatisAnnotation;
import com.test.seckill.po.SuccessKill;

/**
 * Created by chengwanchao on 2016/7/4.
 */
@MybatisAnnotation
public interface SuccessKillDao {
    int insetIntoSuccessKill(long seckilllId, long userPhone);

    SuccessKill queryByIdWithSecKill(long seckilllId);
}
