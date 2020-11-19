package com.example.ribbon.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class RoundConfiguration {

    @Bean
    public ServerList<Server> ribbonServerList() {
        // 实例列表
        String listOfServers = "http://localhost:7000,http://localhost:7001";
        String[] splits = listOfServers.split(",");
        int len = splits.length;

        Server[] servers = new Server[len];
        for (int i = 0; i < len; i++) {
            servers[i] = new Server(splits[i].trim());
        }
        return new StaticServerList<Server>(servers);
    }

    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为轮训
        return new RoundRobinRule();
    }
}