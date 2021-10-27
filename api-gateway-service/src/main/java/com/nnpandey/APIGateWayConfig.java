package com.nnpandey;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGateWayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
        .route(r -> r.path("/api/auth/**")
                        .uri("http://localhost:8083/")
                        .id("authService"))
                .route(r -> r.path("/api/user/**")
                        .uri("http://localhost:8083/")
                        .id("useService"))
                .route(r -> r.path("/api/role/**")
                        .uri("http://localhost:8083/")
                        .id("roleService"))
                .route(r -> r.path("/api/user/change-function/**")
                        .uri("http://localhost:8083/")
                        .id("changeUserFunction"))
                .route(r -> r.path("/api/permission/**")
                        .uri("http://localhost:8083/")
                        .id("permissionSevice"))
                .route(r -> r.path("/api/license/**")
                        .uri("http://localhost:8083/")
                        .id("licenseSevice"))
                .route(r -> r.path("/api/zone/**")
                        .uri("http://localhost:8083/")
                        .id("zoneSevice"))
                .route(r -> r.path("/api/api-key/**")
                        .uri("http://localhost:8083/")
                        .id("apikeyservices"))
                .route(r -> r.path("/api/ac/**")
                        .uri("http://localhost:8080/")
                        .id("access-control"))
                .route(r -> r.path("/api/triggers/**")
                        .uri("http://localhost:8092/")
                        .id("event-triggers"))
                .route(r -> r.path("/api/config-engine/**")
                        .uri("http://localhost:8086/")
                        .id("config-engine"))
                .route(r -> r.path("/docs/axess.ai/home")
                        .uri("http://localhost:8088/")
                        .id("util test"))
                .route(r -> r.path("/docs/**")
                        .uri("https://iotechdesigns.document360.io/")
                        .id("util test"))
                .route(r -> r.path("/api/**")
                        .uri("http://localhost:8085/")
                        .id("microservice_name"))
                .build();
    }

}
