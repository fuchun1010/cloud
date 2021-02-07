package com.tank.entity.goods.req;

import com.google.common.collect.Sets;
import com.tank.entity.goods.Item;
import io.vavr.collection.Stream;
import lombok.*;

import java.beans.Transient;
import java.util.Set;

/**
 * @author tank198435163.com
 */
@NoArgsConstructor
public class GoodsLockReq {

  @Transient
  public void addGoods(@NonNull final String skuCode, int weight) {
    if (weight < 0) {
      throw new IllegalArgumentException("weight not allowed less than zero");
    }
    val item = new Item();
    item.setSku(skuCode);
    item.setWeight(weight);
    this.goods.add(item);
  }

  @Transient
  public boolean illegalWeight() {
    return Stream.ofAll(this.goods)
            .filter(item -> item.getWeight() < 0)
            .size() > 0;
  }

  @Getter
  @Setter
  private Set<Item> goods = Sets.newHashSet();


}
