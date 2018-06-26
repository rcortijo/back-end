package com.florist.application;

import com.florist.domain.Flower;

public class FlowerDTO {
    private int id;
    private double precio;
    private String color;

    public FlowerDTO(Flower staff){
        this.id = staff.getId();
        this.precio = staff.getPrice();
        this.color = staff.getColor();
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

   
    
}
