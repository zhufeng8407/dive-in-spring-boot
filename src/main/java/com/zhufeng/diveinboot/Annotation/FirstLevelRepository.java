package com.zhufeng.diveinboot.Annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repository
public @interface FirstLevelRepository {

    String value() default "";
}
