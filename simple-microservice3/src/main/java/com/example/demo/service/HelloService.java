package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@RefreshScope
@Service
public class HelloService {
    @Value("${greeting.message}")
    private String greetingMessage;

   public String hello() {
        return greetingMessage;
    }
}
