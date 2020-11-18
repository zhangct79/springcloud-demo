package com.example.test.controller;

import com.example.test.ribbon.DefaultRibbonConfig;
import com.example.test.ribbon.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClients(value={@RibbonClient(name="serviceA",configuration = RibbonConfiguration.class),
        @RibbonClient(name="serviceB",configuration = DefaultRibbonConfig.class)})
public class TestController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        String result = restTemplate.getForObject("http://"+ "serviceA" +"/hello",String.class);
        System.out.println(result);
        return result;
    }

    @GetMapping("/hello1")
    public String hello1() {
        String result = restTemplate.getForObject("http://"+ "serviceB" +"/hello",String.class);
        System.out.println(result);
        return result;
    }
}
