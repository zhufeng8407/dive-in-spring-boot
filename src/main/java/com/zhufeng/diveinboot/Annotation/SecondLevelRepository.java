package com.zhufeng.diveinboot.Annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
