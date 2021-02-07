package com.tank.msstock.ctrl;

import com.tank.entity.goods.req.GoodsLockReq;
import com.tank.entity.goods.res.GoodsLockedRes;
import lombok.NonNull;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.stream.Collectors;

import static com.tank.msorder.service.mapping.UrlMapping.STOCK_PREFIX_URL;

/**
 * @author tank198435163.com
 */
@CrossOrigin
@RequestMapping(STOCK_PREFIX_URL)
@RestController
public class StockCtrl {

  @SneakyThrows({AccessDeniedException.class})
  @PostMapping("/{storeCode}/lock/goods")
  public ResponseEntity<GoodsLockedRes> lockGoodsStock(@NonNull @PathVariable final String storeCode,
                                                       @NonNull @RequestBody final GoodsLockReq goodsLockReq) {

    if (goodsLockReq.illegalWeight()) {
      throw new AccessDeniedException("weight less than zero");
    }

    val results = goodsLockReq.getGoods()
            .stream()
            .limit(2)
            .collect(Collectors.toSet());

    val goodsLockedRes = new GoodsLockedRes();
    goodsLockedRes.setStoreCode(storeCode);
    goodsLockedRes.setGoods(results);
    return ResponseEntity.ok(goodsLockedRes);
  }


}
