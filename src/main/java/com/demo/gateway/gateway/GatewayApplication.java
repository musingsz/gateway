package com.demo.gateway.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
 
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
	

	
	@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes().route(r -> r.path("/test/baidu").uri("http://ww.baidu.com"))
                .route(r -> r.path("/hello/**").uri("lb://mweb"))
                .build();
    }
 
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}