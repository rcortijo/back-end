package com.florist.domain;

public class Tree extends AbsProduct {

  protected double hight;

  public Tree(double price, double hight) throws Exception {
    super(price);
    if (hight <= 0)
      throw new Exception();
    this.hight = hight;

  }

  public double getHight() {
    return hight;
  }

  @Override
  public String toString() {
    return ("Tree -> ID: "+id + ", PRECIO: " + price + ", ALTURA:" + hight);
  }

}
