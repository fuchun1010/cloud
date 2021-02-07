package com.tank.entity.goods.res;

import com.google.common.collect.Sets;
import com.tank.entity.goods.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
public class GoodsLockedRes {


  private String storeCode;

  private Set<Item> goods = Sets.newHashSet();

}
