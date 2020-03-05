package com.chao.springcloud.service.impl;

import com.chao.springcloud.service.CalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public long add(long a, long b) {
        return a + b;
    }
}
