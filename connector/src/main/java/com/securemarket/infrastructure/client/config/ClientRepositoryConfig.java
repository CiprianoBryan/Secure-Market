package com.securemarket.infrastructure.client.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.securemarket.infrastructure.client.dao.repository",
})
public class ClientRepositoryConfig {

}
