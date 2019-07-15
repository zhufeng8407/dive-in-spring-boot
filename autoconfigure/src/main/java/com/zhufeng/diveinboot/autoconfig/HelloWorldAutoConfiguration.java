package com.zhufeng.diveinboot.autoconfig;


import com.zhufeng.diveinboot.Annotation.EnableHelloWorld;
import com.zhufeng.diveinboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;


@EnableHelloWorld
@Configuration
@ConditionalOnSystemProperty(name="user.name", value = "zhufeng")
public @interface HelloWorldAutoConfiguration {
}
