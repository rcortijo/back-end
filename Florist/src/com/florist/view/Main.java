package com.florist.view;

import com.florist.application.DecorationDTO;
import com.florist.application.FloristController;
import com.florist.application.FloristDTO;
import com.florist.application.FlowerDTO;
import com.florist.application.TreeDTO;
import java.util.List;



public class Main {

  public static void main(String[] args) throws Exception {
    
        FloristController control = new FloristController();

        FloristDTO floristDto = control.createFlorist("ROSAS BLANCAS");
        control.addTree(15.30, 2.30);
        control.addFlower(5.60, "ROJO");
        control.addDecoration(150.60, "MADERA");

        control.addTree(10.30, 6.30);
        control.addFlower(1.60, "AMARILLO");
        control.addDecoration(100.60, "PLASTICO");

        
        System.out.println("FLORIST: "+floristDto.getName());
        System.out.println("====================================================");
        List<TreeDTO> dtos1=control.getAllTrees();
        dtos1=control.getAllTrees();
        System.out.println("TREES:");
        for(TreeDTO staff :dtos1){
            System.out.println("ID: "+staff.getId()+", Price: "+staff.getPrecio()+", Heigth: "+staff.getHeight());
        }
        
        List<FlowerDTO> dtos2=control.getAllFlowers();
        dtos2=control.getAllFlowers();
        System.out.println("FLOWERS:");
        for(FlowerDTO staff :dtos2){
             System.out.println("ID: "+staff.getId()+", Price: "+staff.getPrecio()+", Color: "+staff.getColor());
        }
        
        List<DecorationDTO> dtos3=control.getAllDecorations();
        dtos3=control.getAllDecorations();
        System.out.println("DECORATIONS:");
        for(DecorationDTO staff :dtos3){
             System.out.println("ID: "+staff.getId()+", Price: "+staff.getPrecio()+", Tipo de Material: "+staff.getTipoMaterial());
        }
        
           


    
  }
  
}
