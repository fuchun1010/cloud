package com.tank.orderservice.service;

import com.tank.entity.goods.req.GoodsLockReq;
import com.tank.entity.goods.res.GoodsLockedRes;
import lombok.NonNull;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.tank.msorder.service.mapping.UrlMapping.STOCK_PREFIX_URL;

/**
 * @author tank198435163.com
 */

@FeignClient("ms-stock")
public interface GoodsService {

  /**
   * try to lock goods stock
   *
   * @param storeCode
   * @param goodsLockReq
   * @return
   * @throws Exception
   */
  @LoadBalanced
  @PostMapping(STOCK_PREFIX_URL + "/{storeCode}/lock/goods")
  ResponseEntity<GoodsLockedRes> lockGoodsStock(@NonNull @PathVariable final String storeCode,
                                                @NonNull @RequestBody final GoodsLockReq goodsLockReq) throws Exception;
}
