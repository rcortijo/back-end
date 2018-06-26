package com.florist.domain;

import com.florist.utilities.TypeMaterials;

public class Decoration extends AbsProduct {
    
 

  protected TypeMaterials typeMaterial;

  public Decoration(double price, TypeMaterials typeMaterial) throws Exception {

    super(price);
    if (typeMaterial == null) throw new Exception();
    else if (typeMaterial.equals(TypeMaterials.MADERA)){
        this.typeMaterial=TypeMaterials.MADERA;
    }else if (typeMaterial.equals(TypeMaterials.PLASTICO)){
        this.typeMaterial=TypeMaterials.PLASTICO;
    }
    
    this.typeMaterial = typeMaterial;

  }

  public TypeMaterials getTypeMaterial() {
    return typeMaterial;
  }

  

}
