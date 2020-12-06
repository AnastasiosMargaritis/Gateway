package com.gateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LocalHostRoutesConfig {

    @Bean
    public RouteLocator localHostRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/users*", "/users/*")
                        .uri("http://localhost:8080"))
                .route(r -> r.path("/msB*")
                        .uri("http://localhost:8081"))
                .build();
    }
}
