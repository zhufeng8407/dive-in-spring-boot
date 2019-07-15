package com.zhufeng.diveinboot.bootstrap;

import com.zhufeng.diveinboot.Annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@EnableHelloWorld
public class EnableHelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
                .web(WebApplicationType.NONE).run(args);

        System.out.println(context.getBean("helloWorld"));
        context.close();
    }
}
