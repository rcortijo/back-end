package com.florist.application;

import com.florist.domain.Tree;

public class TreeDTO {
    private int id;
    private double precio;
    private double height;

    public TreeDTO(Tree staff){
        this.id = staff.getId();
        this.precio = staff.getPrice();
        this.height = staff.getHight();
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public double getHeight() {
        return height;
    }
    public String getDatos(){
        return "ID: "+getId()+", Price: "+getPrecio()+", Heigth: "+getHeight();
    }
}
