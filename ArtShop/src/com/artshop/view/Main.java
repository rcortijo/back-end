package com.artshop.view;

import com.artshop.application.ArtShopController;
import com.artshop.application.ArtShopDTO;
import com.artshop.application.PictureDTO;
import java.util.List;

public class Main {

    private static ArtShopController controller = new ArtShopController();

    public static void main(String[] args) throws Exception {

        ArtShopDTO artShopDto = controller.createArtShop("BOTIGA XYZ", 4);
        controller.createPicture("Mona Lisa", "Leonardo da Vinci");
        controller.createPicture("Guernica ", "Pablo Picasso");
        controller.createPicture("El Grito", "Edvard Munch");
        controller.createPicture("Rueda de Bicicleta", "Marcel Duchamp");
        controller.createPicture("Nenúfares", "Monet");
        controller.createPicture("La noche estrellada", "van Gogh");


        System.out.println("BOTIGA: " + artShopDto.getName() + " Capacidad: " + artShopDto.getCapacity());
        List<PictureDTO> pictures = controller.getStock();
        for (PictureDTO staff : pictures) {
            System.out.println(staff.getData());
        }
        System.out.println("Burn It All!!");
        controller.burnItAll();

        pictures = controller.getStock();
        for (PictureDTO staff : pictures) {
            System.out.println(staff.getData());
        }

    }

}
