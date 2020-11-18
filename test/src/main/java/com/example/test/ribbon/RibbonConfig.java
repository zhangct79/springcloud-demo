package com.example.test.ribbon;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "serviceB", configuration = RibbonConfiguration.class)
public class RibbonConfig {
}
