package com.zhufeng.diveinboot.Annotation;

import com.zhufeng.diveinboot.selector.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import({HelloWorldImportSelector.class})
public @interface EnableHelloWorldBySelector {

    SelectorMode selectorMode() default SelectorMode.HELLOWORLD;
}
