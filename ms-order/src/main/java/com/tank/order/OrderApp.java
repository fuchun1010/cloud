package com.tank.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tank198435163.com
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class OrderApp {
  public static void main(String[] args) {
    SpringApplication.run(OrderApp.class, args);
  }
}
