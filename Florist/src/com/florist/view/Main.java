package com.florist.view;

import com.florist.application.DecorationDTO;
import com.florist.application.FloristController;
import com.florist.application.FloristDTO;
import com.florist.application.FlowerDTO;
import com.florist.application.TreeDTO;
import com.florist.utilities.TypeMaterials;
import java.util.List;



public class Main {

  public static void main(String[] args) throws Exception {
    
        FloristController control = new FloristController();

        TypeMaterials typeMaterial = null;
        FloristDTO floristDto = control.createFlorist("ROSAS BLANCAS");
        control.addTree(15.30, 2.30);
        control.addFlower(5.60, "ROJO");
        control.addDecoration(150.60, typeMaterial.MADERA);

        control.addTree(10.30, 6.30);
        control.addFlower(1.60, "AMARILLO");
        control.addDecoration(100.60, typeMaterial.PLASTICO);

        listarStock(floristDto, control);
     
  }

    private static void listarStock(FloristDTO floristDto, FloristController control) throws Exception{
        System.out.println("FLORIST: "+floristDto.getName());
        System.out.println("====================================================");
        List<TreeDTO> trees=control.getAllTrees();
        System.out.println("TREES:");
        for(TreeDTO staff :trees){
            System.out.println("ID: "+staff.getId()+", Price: "+staff.getPrecio()+", Heigth: "+staff.getHeight());
        }
        
        List<FlowerDTO> flowers=control.getAllFlowers();
        System.out.println("FLOWERS:");
        for(FlowerDTO staff :flowers){
             System.out.println("ID: "+staff.getId()+", Price: "+staff.getPrecio()+", Color: "+staff.getColor());
        }
        
        List<DecorationDTO> decorations=control.getAllDecorations();
        System.out.println("DECORATIONS:");
        for(DecorationDTO staff :decorations){
             System.out.println("ID: "+staff.getId()+", Price: "+staff.getPrecio()+", Tipo de Material: "+staff.getTipoMaterial());
        }
    }
  
}
