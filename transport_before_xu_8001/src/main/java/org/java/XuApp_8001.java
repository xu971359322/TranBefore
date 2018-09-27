package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class XuApp_8001 {

    public static void main(String[] args) {
        SpringApplication.run(XuApp_8001.class,args);
    }
}
