package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HmApp_8002 {

    public static void main(String[] args) {
        SpringApplication.run(HmApp_8002.class,args);
    }
}
