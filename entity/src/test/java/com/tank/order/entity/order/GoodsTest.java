package com.tank.order.entity.order;

import lombok.val;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author tank198435163.com
 */
@DisplayName("商品测试")
class GoodsTest {

  @Test
  @DisplayName("商品价格计算")
  void priceOf() {
    val result = this.goods.priceOf();
    Assertions.assertNotNull(result);
  }

  @BeforeEach
  void initialize() {
    this.goods = new Goods();
    this.goods.setDesc("apple");
    this.goods.setId(1L);
    this.goods.setName("apple");
    this.goods.setWeight(100);
    this.goods.setUnitPrice(346);
  }

  private Goods goods;
}