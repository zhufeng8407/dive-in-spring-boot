package com.zhufeng.diveinboot.bootstrap;

import com.zhufeng.diveinboot.service.CalculateService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.zhufeng.diveinboot.service")
public class ProfileBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ProfileBootstrap.class)
                .profiles("java8").run(args);

        System.out.println(context.getBean(CalculateService.class).sum(1,2,3,4,5,6,7,8,9));
        context.close();
    }
}
