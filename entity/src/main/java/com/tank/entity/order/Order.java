package com.tank.entity.order;

import com.google.common.collect.Sets;
import com.tank.entity.goods.Goods;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
public class Order {
  
  private Set<Goods> goods = Sets.newHashSet();

  @NotEmpty(message = "购买时间不允许是空")
  private String createDateTime;

  private String orgCode;
}
