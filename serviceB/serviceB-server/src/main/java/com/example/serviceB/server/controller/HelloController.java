package com.example.serviceB.server.controller;

import com.example.serviceB.common.PersonModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String applicationName;

    @RequestMapping("hello")
    public String hello() {
        return applicationName+":"+port;
    }

    @RequestMapping("person")
    public PersonModel person() {
        PersonModel personModel = new PersonModel();
        personModel.setAge(41);
        personModel.setId(1);
        personModel.setName("zhangct");
        return personModel;
    }
}
