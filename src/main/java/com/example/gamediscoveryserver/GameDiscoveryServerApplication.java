package com.example.gamediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GameDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameDiscoveryServerApplication.class, args);
    }

}
