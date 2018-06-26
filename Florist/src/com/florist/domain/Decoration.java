package com.florist.domain;

public class Decoration extends AbsProduct {

  protected String typeMaterial;

  public Decoration(double price, String typeMaterial) throws Exception {

    super(price);
    if (typeMaterial == null && (typeMaterial != "PLASTICO" || typeMaterial != "MADERA"))
      throw new Exception();
    this.typeMaterial = typeMaterial;

  }

  public String getTypeMaterial() {
    return typeMaterial;
  }

  @Override
  public String toString() {
    return ("Decoration -> ID:" + id + ", PRECIO:" + price + ", TIPO DE MATERIAL:" + typeMaterial);
  }

}
