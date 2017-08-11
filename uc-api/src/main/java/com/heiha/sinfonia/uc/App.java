package com.heiha.sinfonia.uc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <br>
 * <b>Project:</b> uc<br>
 * <b>Date:</b> 2017/8/8 18:55<br>
 * <b>Author:</b> heiha<br>
 */
@EnableEurekaClient
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
