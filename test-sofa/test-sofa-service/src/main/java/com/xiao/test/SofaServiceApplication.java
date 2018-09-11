package com.xiao.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xiao
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = {"com.xiao"})
public class SofaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofaServiceApplication.class, args);
    }

}