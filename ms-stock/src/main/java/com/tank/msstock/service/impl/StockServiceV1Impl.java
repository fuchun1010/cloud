package com.tank.msstock.service.impl;


import com.tank.msstock.service.StockService;

/**
 * @author tank198435163.com
 */
public class StockServiceV1Impl implements StockService {

  @Override
  public boolean lockGoods() {
    return true;
  }

  @Override
  public void subGoods() {
    System.out.println("扣减库存");
  }

  @Override
  public boolean recoveryLockedGoods() {
    return false;
  }

}
