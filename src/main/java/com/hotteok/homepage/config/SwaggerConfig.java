package com.hotteok.homepage.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {

    @Bean
    public OpenAPI OpenAPI() {
        return new OpenAPI();
    }
}
