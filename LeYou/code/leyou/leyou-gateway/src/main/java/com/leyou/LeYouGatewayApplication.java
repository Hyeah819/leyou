package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author hhl
 * @date - 21:05
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LeYouGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeYouGatewayApplication.class,args);
    }

}