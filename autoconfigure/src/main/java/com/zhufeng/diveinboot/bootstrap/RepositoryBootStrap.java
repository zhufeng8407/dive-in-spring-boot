package com.zhufeng.diveinboot.bootstrap;

import com.zhufeng.diveinboot.repository.MyFirstRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.zhufeng.diveinboot.repository")
public class RepositoryBootStrap {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
                .web(WebApplicationType.NONE).run(args);

        System.out.println(context.getBean("myFirstRepository", MyFirstRepository.class));
        context.close();

    }
}
