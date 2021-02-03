package com.tank.order.service;

import cn.hutool.core.lang.UUID;
import com.tank.entity.order.Order;
import com.tank.order.service.order.OrderCreation;
import lombok.NonNull;
import org.springframework.stereotype.Component;

/**
 * @author tank198435163.com
 */
@Component("orderV1")
public class OrderV1Impl implements OrderCreation {
  @Override
  public String createOrder(@NonNull Order order) {
    return UUID.fastUUID().toString(true);
  }
}
