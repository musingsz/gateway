package com.demo.gateway.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@Configuration
public class GatewayApplication {
	


	
	
//
//	 @Bean
//	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//	        return builder.routes()
//	                .route(r -> r.path("/mweb/**")
//	                        .uri("lb://mweb-service")
//	                        .id("mwebModule"))
//	                
//	                .build();
//	    
//
//	}

 
	public static void main(String[] args) {
		System.out.print("1");
		SpringApplication.run(GatewayApplication.class, args);
	}

}