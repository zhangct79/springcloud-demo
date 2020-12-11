package com.example.serviceC.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String applicationName;

    @Value("${person.name}")
    String personName;

    @RequestMapping("hello")
    public String hello() throws InterruptedException {
        Thread.sleep(2000);
        return applicationName+":"+port+":"+personName;
    }
}
