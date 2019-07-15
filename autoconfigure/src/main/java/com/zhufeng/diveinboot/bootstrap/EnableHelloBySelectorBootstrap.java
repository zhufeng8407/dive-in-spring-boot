package com.zhufeng.diveinboot.bootstrap;

import com.zhufeng.diveinboot.Annotation.EnableHelloWorldBySelector;
import com.zhufeng.diveinboot.Annotation.SelectorMode;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloWorldBySelector(selectorMode = SelectorMode.HELLOCUST)
public class EnableHelloBySelectorBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloBySelectorBootstrap.class)
                .web(WebApplicationType.NONE).run(args);

        if (context.containsBean("helloWorld"))
            System.out.println("helloWorld Bean: " + context.getBean("helloWorld"));
        if (context.containsBean("helloCust"))
            System.out.println("helloCust Bean: " + context.getBean("helloCust"));

        context.close();

    }
}
