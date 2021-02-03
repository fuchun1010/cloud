package com.tank.entity.goods;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
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

  @NotEmpty(message = "sku不允许是空")
  private String sku;

  @NotEmpty(message = "spu不允许是空")
  private String spu;

  private String name;

  private String desc;

  @Min(1)
  private int unitPrice;

  @Min(1)
  private int weight;


}
