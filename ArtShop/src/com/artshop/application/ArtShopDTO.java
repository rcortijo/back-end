package com.artshop.application;

import com.artshop.domain.ArtShop;

public class ArtShopDTO {
  private String name;
  private int capacity;

  public ArtShopDTO(ArtShop shop1) throws Exception {
    if (shop1 == null)
      throw new Exception();
    this.name = shop1.nameShop();
    this.capacity = shop1.getCapacity();

  }

  public String getName() {
    return name;
  }

  public int getCapacity() {
    return capacity;
  }

}
