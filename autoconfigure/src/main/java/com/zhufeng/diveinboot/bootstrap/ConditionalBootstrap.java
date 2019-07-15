package com.zhufeng.diveinboot.bootstrap;


import com.zhufeng.diveinboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@ConditionalOnSystemProperty(name="user.name", value = "zhufeng")
public class ConditionalBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);


        context.close();
    }
}
