package com.example.demo.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
   public String hello() {
        return "Hello";
    }
}
