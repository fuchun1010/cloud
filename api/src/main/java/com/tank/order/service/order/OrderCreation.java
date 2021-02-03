package com.tank.order.service.order;

import com.tank.order.entity.order.Order;
import lombok.NonNull;

/**
 * @author tank198435163.com
 */
public interface OrderCreation {

  String createOrder(@NonNull final Order order);
}
