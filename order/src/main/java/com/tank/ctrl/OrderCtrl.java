package com.tank.ctrl;

import com.tank.entity.req.OrderCreationReq;
import com.tank.entity.req.OrderCreationRes;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.tank.service.mapping.UrlMapping.PREFIX_URL;

/**
 * @author tank198435163.com
 */
@CrossOrigin("*")
@RestController
@RequestMapping(PREFIX_URL)
public class OrderCtrl {

  @PostMapping("/createdOrder")
  public ResponseEntity<OrderCreationRes> createdOrder(@RequestBody OrderCreationReq orderCreationReq) {
    val res = new OrderCreationRes();
    res.setOrderNo("order0001");
    return ResponseEntity.ok(res);
  }

}
