package com.tank.order.entity.order;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
public class Order {

  private Set<Goods> goods = Sets.newHashSet();

  private String createDateTime;

  private String orgCode;
}
