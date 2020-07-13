package com.yy.cloudeurekauser;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaUserFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaUserFeginApplication.class, args);
    }

    @Bean
    public Logger.Level feignLoggerLevel(){
        //NONE：默认不显示日志
        //BASIC: 仅显示请求方法、RUL、响应状态码及执行时间
        // HEADERS：除了BASIC中定义的信息之外，还包括请求和响应的头信息
        // FULL: 除了HEADERS中定义的信息之外，还有请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
