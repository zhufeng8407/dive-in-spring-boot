package com.zhufeng.diveinboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Profile("java8")
@Service
public class Java8CalculateService implements CalculateService{


    @Override
    public int sum(int... a) {
        System.out.println("java8 sum start");
        return Arrays.stream(a).sum();
    }


}
