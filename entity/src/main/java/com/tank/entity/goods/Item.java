package com.tank.entity.goods;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = {"sku"})
public class Item {

  private String sku;

  private int weight;
}
