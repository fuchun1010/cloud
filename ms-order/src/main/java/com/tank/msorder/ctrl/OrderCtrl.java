package com.tank.msorder.ctrl;

import com.tank.entity.order.req.OrderCreationReq;
import com.tank.entity.order.res.OrderCreationRes;
import com.tank.msorder.service.order.OrderCreation;
import lombok.NonNull;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import static com.tank.msorder.service.mapping.UrlMapping.ORDER_PREFIX_URL;

/**
 * @author tank198435163.com
 */
@CrossOrigin("*")
@RestController
@RequestMapping(ORDER_PREFIX_URL)
public class OrderCtrl {

  @PostMapping("/{orgCode}/order/created")
  public ResponseEntity<OrderCreationRes> createdOrder(@NonNull final @PathVariable String orgCode,
                                                       @NonNull final @RequestBody OrderCreationReq orderCreationReq) {
    val res = new OrderCreationRes();
    val order = orderCreationReq.getOrder();
    order.setOrgCode(orgCode);
    val orderNo = this.orderCreation.createOrder(order);
    res.setOrderNo(orderNo);
    return ResponseEntity.ok(res);
  }


  @Resource(name = "orderV1")
  private OrderCreation orderCreation;

}
