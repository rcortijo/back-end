package com.artshop.application;

import java.util.ArrayList;

import com.artshop.domain.ArtShop;
import com.artshop.domain.Picture;

import java.util.List;

public class ArtShopController {

    ArtShop artShop;

    public ArtShopController() {

    }

    public ArtShopDTO createArtShop(String nameShop, int capacity) throws Exception {
        artShop = new ArtShop(nameShop, capacity);
        return new ArtShopDTO(artShop);
    }

    public PictureDTO createPicture(String name, String author) throws Exception {
        Picture picture = new Picture(name, author);
        artShop.addPictureShop(picture);
        return new PictureDTO(picture);

    }

    public List<PictureDTO> getStock() throws Exception {
        List<PictureDTO> dtos = new ArrayList();
        for (Picture staff : artShop.getPicturesShop()) {
            PictureDTO dto = new PictureDTO(staff);
            dtos.add(dto);
        }
        return dtos;
    }

    public void burnItAll() throws Exception {
        artShop.burntItall();
    }

}
