package com.yy.cloudeurekauser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaUserApplication.class, args);
    }

}
