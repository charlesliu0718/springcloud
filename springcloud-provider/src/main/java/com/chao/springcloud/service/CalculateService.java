package com.chao.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculateService {
    public long add(long a, long b);
}
