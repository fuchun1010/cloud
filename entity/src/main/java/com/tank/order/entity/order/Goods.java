package com.tank.order.entity.order;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import javax.validation.constraints.Min;
import java.beans.Transient;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author tank198435163.com
 */
@Getter
@Setter
@EqualsAndHashCode(of = {"sku"})
public class Goods {

  @Transient
  public BigDecimal priceOf() {
    val factor = new BigDecimal(10000);
    val w = new BigDecimal(this.weight);
    val price = new BigDecimal(this.unitPrice);
    return w.multiply(price).divide(factor, 2, RoundingMode.HALF_UP);
  }

  private Long id;

  private String sku;

  private String spu;

  private String name;

  private String desc;

  @Min(1)
  private int unitPrice;

  @Min(1)
  private int weight;


}
