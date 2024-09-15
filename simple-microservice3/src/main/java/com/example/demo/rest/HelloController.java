package com.example.demo.rest;

import com.example.demo.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class HelloController {
    private final HelloService helloService;

    @GetMapping
    public String hello() {
        return helloService.hello();
    }
}
