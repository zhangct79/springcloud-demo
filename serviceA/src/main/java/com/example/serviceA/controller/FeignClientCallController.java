package com.example.serviceA.controller;


import com.example.serviceB.common.PersonModel;
import com.example.serviceBapi.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class FeignClientCallController {
    @Autowired
    IServiceBApi iServiceBApi;

    @RequestMapping("hello")
    public String hello() {
        return iServiceBApi.hello();
    }

    @RequestMapping("person")
    public PersonModel person() {
        return iServiceBApi.person();
    }
}
