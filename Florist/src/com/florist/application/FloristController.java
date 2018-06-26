package com.florist.application;

import java.util.List;

import com.florist.domain.AbsProduct;
import com.florist.domain.Decoration;
import com.florist.domain.Florist;
import com.florist.domain.Flower;
import com.florist.domain.Tree;
import com.florist.repository.ProductRepository;
import java.util.ArrayList;

public class FloristController {
    Florist florist;
    private ProductRepository repository;

    public FloristController() {
        repository = new ProductRepository();
    }

  
    public FloristDTO createFlorist(String name) throws Exception {
        florist = new Florist(name);
        return new FloristDTO(florist);
    }
    public TreeDTO addTree(double price, double height) throws Exception {
        Tree tree = new Tree(price, height);
        repository.addTree(tree);
        return new TreeDTO(tree);
    }
    public FlowerDTO addFlower(double price, String color) throws Exception {
        Flower flower = new Flower(price, color);
        repository.addFlower(flower);
        return new FlowerDTO(flower);
    }
    public DecorationDTO addDecoration(double price, String tipoMaterial) throws Exception {
        Decoration decoration = new Decoration(price, tipoMaterial);
        repository.addDecoration(decoration);
        return new DecorationDTO(decoration);
    }
  
    
    public List<TreeDTO> getAllTrees() {
        List<TreeDTO> dtos = new ArrayList();
        for(Tree staff :repository.getAllTrees()){
            TreeDTO dto = new TreeDTO(staff);
            dtos.add(dto);
        }
        return dtos;
    }
    public List<FlowerDTO> getAllFlowers() {
        List<FlowerDTO> dtos = new ArrayList();
        for(Flower staff :repository.getAllFlowers()){
            FlowerDTO dto = new FlowerDTO(staff);
            dtos.add(dto);
        }
        return dtos;
    }
    public List<DecorationDTO> getAllDecorations() {
        List<DecorationDTO> dtos = new ArrayList();
        for(Decoration staff :repository.getAllDecorations()){
            DecorationDTO dto = new DecorationDTO(staff);
            dtos.add(dto);
        }
        return dtos;
    }
    
    
}
