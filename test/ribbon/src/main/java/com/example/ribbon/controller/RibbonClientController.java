package com.example.ribbon.controller;

import com.example.ribbon.config.RandomConfig;
import com.example.ribbon.config.RoundConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


//@RibbonClients(value={@RibbonClient(name="serviceA",configuration = RoundConfiguration.class),
//        @RibbonClient(name="serviceB",configuration = RandomConfig.class)})
@RestController
public class RibbonClientController {
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
