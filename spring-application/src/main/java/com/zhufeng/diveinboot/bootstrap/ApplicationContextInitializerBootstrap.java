package com.zhufeng.diveinboot.bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextInitializerBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Bootstrap.class)
                .run(args);


        context.close();
    }

    @SpringBootApplication
    class Bootstrap{

    }
}
