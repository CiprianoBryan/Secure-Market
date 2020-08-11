package com.securemarket.config;

import com.securemarket.client.config.ClientConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ClientConfig.class
})

@ComponentScan(basePackages = {
        "com.securemarket.infrastructure.config"
})
public class ApplicationConfig {

}
