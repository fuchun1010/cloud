package com.tank.orderservice.ctrl;

import cn.hutool.core.util.StrUtil;
import com.tank.entity.goods.req.GoodsLockReq;
import com.tank.entity.goods.res.GoodsLockedRes;
import com.tank.entity.order.req.OrderCreationReq;
import com.tank.entity.order.res.OrderCreationRes;
import com.tank.orderservice.service.GoodsService;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

import static com.tank.msorder.service.mapping.UrlMapping.ORDER_SERVICE_PREFIX_URL;

/**
 * @author tank198435163.com
 */
@CrossOrigin
@RestController
@RequestMapping(ORDER_SERVICE_PREFIX_URL)
public class OrderServiceCtrl {

  @SneakyThrows({Exception.class})
  @PostMapping("/{storeCode}/order/created")
  public ResponseEntity<OrderCreationRes> createdOrder(@PathVariable @NonNull final String storeCode,
                                                       @NonNull @RequestBody final OrderCreationReq orderCreationReq) {
    if (StrUtil.isEmptyIfStr(storeCode)) {
      throw new IllegalArgumentException("store");
    }
    val goodsLockReq = new GoodsLockReq();
    orderCreationReq.getOrder().getGoods().forEach(item -> goodsLockReq.addGoods(item.getSku(), item.getWeight()));
    val response = this.goodsService.<GoodsLockedRes>lockGoodsStock(storeCode, goodsLockReq);
    val isOk = Objects.nonNull(response) && !response.getBody().getGoods().isEmpty();

    if (isOk) {
      val orderCreationRes = new OrderCreationRes();
      orderCreationRes.setOrderNo("1001");
      return ResponseEntity.ok(orderCreationRes);
    }

    return ResponseEntity.noContent().build();
  }

  @Resource
  private GoodsService goodsService;
}
