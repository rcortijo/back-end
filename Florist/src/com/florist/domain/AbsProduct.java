package com.florist.domain;

public abstract class AbsProduct {

  protected int id;
  protected double price;
  private static int COUNTER_PRODUCT = 1;
  
  public AbsProduct(double price) throws Exception {
    if (price <= 0)
      throw new Exception();
    this.price = price;
    id = COUNTER_PRODUCT;
    COUNTER_PRODUCT++;
  }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public static int getCOUNTER_PRODUCT() {
        return COUNTER_PRODUCT;
    }

  
}
