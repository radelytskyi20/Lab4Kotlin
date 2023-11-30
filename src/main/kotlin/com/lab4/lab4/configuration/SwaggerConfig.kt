package com.lab4.lab4.configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class SwaggerConfig {
    @Bean
    fun usersMicroserviceOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info().title("Your API Title")
                    .description("Your API Description")
                    .version("1.0")
            )
    }
}