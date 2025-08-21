package com.example.bingebuddy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
  @Bean
  RestClient tvMazeRestClient(@Value("${tvmaze.base-url:https://api.tvmaze.com}") String baseUrl) {
    return RestClient.builder().baseUrl(baseUrl).build();
  }
}

