package com.tank.entity.order;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
@EqualsAndHashCode(of = {"sku"})
public class Goods {

  private Long id;

  private String sku;

  private String spu;

  private String name;

  private String desc;

  private int amount;

  private int weight;

}
