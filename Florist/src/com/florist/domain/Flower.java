package com.florist.domain;

public class Flower extends AbsProduct {

  protected String color;

  public Flower(double price, String color) throws Exception {
    super(price);
    if (color == null)
      throw new Exception();
    this.color = color;
  }

  public String getColor() {
    return color;
  }

 

}
