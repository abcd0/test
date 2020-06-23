package com.example.demo.service.impl;

import com.example.demo.service.AddService;
import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
