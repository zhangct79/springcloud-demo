package com.example.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallbackController {

    @RequestMapping(value = "/fallback")
    public Map<String, String> fallBackController() {
        Map<String, String> res = new HashMap();
        res.put("code", "-100");
        res.put("data", "service not available");
        return res;

    }

    @RequestMapping(value = "/fallback2")
    public Map<String, String> fallBackController2() {
        Map<String, String> res = new HashMap();
        res.put("code", "-100");
        res.put("data", "fallback2");
        return res;

    }

    @RequestMapping(value = "/retryFallback")
    public Map<String, String> retryFallback() {
        Map<String, String> res = new HashMap();
        res.put("code", "-100");
        res.put("data", "retryFallback");
        return res;

    }
}