package com.xhh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xhh.mapper")
public class XhhProviderDictionaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhhProviderDictionaryApplication.class, args);
    }
}
