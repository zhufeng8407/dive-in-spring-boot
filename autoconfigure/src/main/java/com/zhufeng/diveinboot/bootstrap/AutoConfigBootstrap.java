package com.zhufeng.diveinboot.bootstrap;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class AutoConfigBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(AutoConfigBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        System.out.println(context.getBean("helloWorld"));
        context.close();
    }
}
