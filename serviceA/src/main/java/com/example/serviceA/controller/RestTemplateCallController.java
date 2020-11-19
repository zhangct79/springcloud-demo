package com.example.serviceA.controller;

import com.example.serviceB.common.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("rest")
public class RestTemplateCallController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("hello")
    public String hello() {
        return restTemplate.getForObject("http://serviceB/hello",String.class);
    }

    @RequestMapping("person")
    public PersonModel person() {
        return restTemplate.getForObject("http://serviceB/person",PersonModel.class);
    }
}
