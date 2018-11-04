package com.srinivas.spring.ms.department.config;

import com.srinivas.spring.ms.department.controller.DepartmentHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class RoutesConfig {

    @Bean
    public RouterFunction<ServerResponse> routes(DepartmentHandler departmentHandler) {
        return route(
                    GET("/department"), departmentHandler::getAll)
                .andRoute(POST("/department").and(accept(MediaType.APPLICATION_JSON)), departmentHandler::create)
                .andRoute(GET("/department/{id}"), departmentHandler::get)
                .andRoute(PUT("/department/{id}").and(accept(MediaType.APPLICATION_JSON)), departmentHandler::update)
                .andRoute(DELETE("/department/{id}"), departmentHandler::delete);
    }
}
