package com.securemarket.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.securemarket.client.rest",
        "com.securemarket.client.service"
})
public class ClientConfig {
}
