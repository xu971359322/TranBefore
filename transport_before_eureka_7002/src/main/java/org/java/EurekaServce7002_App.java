package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServce7002_App {
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaServce7002_App.class, args);
    }

}
