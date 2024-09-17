package com.example.demo.service;

import com.example.demo.entity.Greeting;
import com.example.demo.repository.GreetingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class HelloService {
    private GreetingRepository greetingRepository;


    public String hello() {
        var response = greetingRepository.save(new Greeting("Hello"));
        return response.getMessage();
    }
}
