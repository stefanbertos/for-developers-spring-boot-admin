package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SimpleSchedulerService {
    @Scheduled(fixedRate = 10000)
    public void schedule() {
      log.info("scheduled at {}", System.currentTimeMillis());
    }
}
