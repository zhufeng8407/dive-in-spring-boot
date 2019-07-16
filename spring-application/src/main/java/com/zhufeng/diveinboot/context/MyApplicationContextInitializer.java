package com.zhufeng.diveinboot.context;

import com.zhufeng.diveinboot.postprocessor.MyBeanFactoryPostProcessor;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

public class MyApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>, Ordered {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        System.out.println("ConfigurableApplicationContext: " + context.getClass().getName());
        context.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
