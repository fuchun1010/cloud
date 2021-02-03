package com.tank.entity.order;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.beans.Transient;
import java.util.Set;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
public class Order {

  @Transient
  public void addGoods(@NonNull final Goods goods) {
    this.goods.add(goods);
  }

  private Set<Goods> goods = Sets.newHashSet();

  private String createDateTime;
}
