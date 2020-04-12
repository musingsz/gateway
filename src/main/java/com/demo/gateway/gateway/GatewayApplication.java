package com.demo.gateway.gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
 
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@Configuration
//@EnableConfigServer
public class GatewayApplication {
	


 
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}