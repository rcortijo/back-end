package com.florist.application;

import java.util.List;

import com.florist.domain.AbsProduct;
import com.florist.domain.Decoration;
import com.florist.domain.Florist;
import com.florist.domain.Flower;
import com.florist.domain.Tree;
import com.florist.utilities.TypeMaterials;

import java.util.ArrayList;

public class FloristController {
    Florist florist;
    

    public FloristController() {
    }

  
    public FloristDTO createFlorist(String name) throws Exception {
        florist = new Florist(name);
        return new FloristDTO(florist);
    }
    
    public TreeDTO addTree(double price, double height) throws Exception {
        Tree tree = new Tree(price,height);
        florist.addProduct(tree);
        return new TreeDTO(tree);
    }
    public FlowerDTO addFlower(double price, String color) throws Exception {
        Flower flower = new Flower(price, color);
        florist.addProduct(flower);
        return new FlowerDTO(flower);
    }
    public DecorationDTO addDecoration(double price, TypeMaterials tipoMaterial) throws Exception {
        Decoration decoration = new Decoration(price, tipoMaterial);
        florist.addProduct(decoration);
        return new DecorationDTO(decoration);
    }
  
    
    public List<TreeDTO> getAllTrees() throws Exception{
        List<TreeDTO> dtos = new ArrayList();
        for(AbsProduct staff :florist.getProducts()){
            if(staff instanceof Tree){
                Tree tree = new Tree(staff.getPrice(),((Tree) staff).getHight());
                TreeDTO dto = new TreeDTO(tree);
                dtos.add(dto);
            }
            
        }
        return dtos;
    }
    public List<FlowerDTO> getAllFlowers() throws Exception{
        List<FlowerDTO> dtos = new ArrayList();
        for(AbsProduct staff :florist.getProducts()){
            if(staff instanceof Flower){
                Flower flower = new Flower(staff.getPrice(),((Flower) staff).getColor());
                FlowerDTO dto = new FlowerDTO(flower);
                dtos.add(dto);
            }
            
        }
        return dtos;
    }
    public List<DecorationDTO> getAllDecorations() throws Exception{
        List<DecorationDTO> dtos = new ArrayList();
        for(AbsProduct staff :florist.getProducts()){
            if(staff instanceof Decoration){
                Decoration decoration = new Decoration(staff.getPrice(),((Decoration) staff).getTypeMaterial());
                DecorationDTO dto = new DecorationDTO(decoration);
                dtos.add(dto);
            }
            
        }
        return dtos;
    }
    
    
}
