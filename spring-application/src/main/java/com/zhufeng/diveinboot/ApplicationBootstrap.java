package com.zhufeng.diveinboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationBootstrap {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationBootstrap.class);

        springApplication.setWebApplicationType(WebApplicationType.NONE);

        springApplication.run(args);

    }
}
