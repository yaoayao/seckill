package com.test.seckill.annotation;

import java.lang.annotation.*;

/**
 * Created by chengwanchao on 2016/8/31.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
/**
 * mybatis 扫描注解
 */
public @interface MybatisAnnotation {
    String value() default "";
}
