package com.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.TokenRelayGatewayFilterFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalHostRoutesConfig {


    @Bean
    public RouteLocator localHostRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/oauth/token", "/user")
                        .uri("http://localhost:8901"))
                .route(r -> r.path("/users*", "/users/*")
                        .uri("http://localhost:8080"))
                .route(r -> r.path("/msB*")
                        .uri("http://localhost:8081"))
                .build();
    }
}
