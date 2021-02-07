package com.tank.msstock.service;

/**
 * @author tank198435163.com
 */
public interface StockService {

  /**
   * return lock goods stock success or failure
   *
   * @return
   */
  boolean lockGoods();

  /**
   * decrement stock of items
   */
  void subGoods();

  /**
   * recovery item that are locked
   *
   * @return
   */
  boolean recoveryLockedGoods();

}
