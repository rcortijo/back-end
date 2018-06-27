package com.artshop.domain;

import java.util.ArrayList;
import java.util.List;

public class ArtShop {

  protected String nameShop;
  protected int capacity;
  private List<Picture> pictures = new ArrayList<>();

  public ArtShop(String nameShop, int capacity) throws Exception {

    if (nameShop == null || nameShop.equals(""))
      throw new Exception();
    if (capacity <= 0)
      throw new Exception();
    this.nameShop = nameShop;
    this.capacity = capacity;

  }

  public String nameShop() {
    return nameShop;
  }

  public int getCapacity() {
    return capacity;
  }

  public void addPictureShop(Picture pic) throws Exception {
    if (this.capacity > 0) {
      pictures.add(pic);
      this.capacity = this.capacity - 1;
    }
  }

  public ArrayList<Picture> getPicturesShop() throws Exception {

    return new ArrayList<>(pictures);
  }
  
  public void burntItall() throws Exception {
    pictures.clear();

  }
  

}
