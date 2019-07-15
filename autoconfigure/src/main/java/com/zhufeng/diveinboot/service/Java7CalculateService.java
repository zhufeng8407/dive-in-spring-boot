package com.zhufeng.diveinboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CalculateService implements CalculateService {

    @Override
    public int sum(int... a) {
        System.out.println("java7 sum start");

        int result = 0;

        for (int i : a) {
            result += i;
        }

        return result;
    }
}
