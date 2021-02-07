package com.tank.msstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tank198435163.com
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class StockApp {

  public static void main(final String[] args) {
    SpringApplication.run(StockApp.class, args);
  }
}
