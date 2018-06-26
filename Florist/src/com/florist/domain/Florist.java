package com.florist.domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {

  private String name;
  private List<AbsProduct> products = new ArrayList<>();

  public Florist(String name) throws Exception {
    if (name == "")
      throw new Exception();
    this.name = name;
  }

  public String getName() {
    return name;
  }


  public List<AbsProduct> getProducts() {
    return products;
  }

  public void addProduct(AbsProduct product) {
    products.add(product);
  }

  

}
