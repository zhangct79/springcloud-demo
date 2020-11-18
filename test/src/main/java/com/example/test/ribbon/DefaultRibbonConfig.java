package com.example.test.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DefaultRibbonConfig {
    @Bean
    public ServerList<Server> ribbonServerList() {
        // 实例列表
        String listOfServers = "http://localhost:7000,http://localhost:7001,http://localhost:7002";
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
        return new RandomRule();
    }
}