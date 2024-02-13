package com.apiconsumer.apiconsumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiConsumerConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
