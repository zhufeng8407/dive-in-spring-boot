package com.zhufeng.diveinboot.config;

import org.springframework.context.annotation.Bean;

public class HelloCustConfiguration {

    @Bean
    public String helloCust() {
        return "Hello,Customer 2019";
    }
}
