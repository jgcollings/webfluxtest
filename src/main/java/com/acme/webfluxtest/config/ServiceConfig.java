package com.acme.webfluxtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.server.adapter.ForwardedHeaderTransformer;

@Component
public class ServiceConfig implements WebFluxConfigurer {

    @Bean
    ForwardedHeaderTransformer forwardedHeaderTransformer() {

        return new ForwardedHeaderTransformer();
    }
}
