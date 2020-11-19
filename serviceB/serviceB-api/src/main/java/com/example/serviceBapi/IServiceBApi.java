package com.example.serviceBapi;

import com.example.serviceB.common.PersonModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="ServiceB")
public interface IServiceBApi {
    @RequestMapping("hello")
    public String hello();

    @RequestMapping("person")
    public PersonModel person();
}
