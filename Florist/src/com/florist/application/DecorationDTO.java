package com.florist.application;

import com.florist.domain.Decoration;
import com.florist.utilities.TypeMaterials;

public class DecorationDTO {
    private int id;
    private double precio;
    private TypeMaterials tipoMaterial;

    public DecorationDTO(Decoration staff){
        this.id = staff.getId();
        this.precio = staff.getPrice();
        this.tipoMaterial = staff.getTypeMaterial();
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public TypeMaterials getTipoMaterial() {
        return tipoMaterial;
    }
    public String getDatos(){
        return "ID: "+getId()+", Price: "+getPrecio()+", Heigth: "+getTipoMaterial();
    }

}
