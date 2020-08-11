package com.securemarket.infrastructure.config;

import com.securemarket.infrastructure.client.config.ClientRepositoryConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ClientRepositoryConfig.class
})
@ComponentScan(basePackages = {
        "com.securemarket.infrastructure.client.service",
        "com.securemarket.infrastructure.client.repository"
})
public class ClientConnectorConfig {
}
