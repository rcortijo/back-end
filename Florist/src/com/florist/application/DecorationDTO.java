package com.florist.application;

import com.florist.domain.Decoration;

public class DecorationDTO {
    private int id;
    private double precio;
    private String tipoMaterial;

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

    public String getTipoMaterial() {
        return tipoMaterial;
    }

   
   
    
}
