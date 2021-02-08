package com.tank.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tank198435163.com
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class OrderServiceApp {
  public static void main(final String[] args) {
    SpringApplication.run(OrderServiceApp.class, args);
  }
}
