package com.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {

    private String jwtSigningKey="345345fsdfsf5345";

    public String getJwtSigningKey() {
        return jwtSigningKey;
    }
}
