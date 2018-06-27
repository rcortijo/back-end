package com.artshop.application;

import com.artshop.domain.Picture;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PictureDTO {

    private String name;
    private String author;
    private Date date;

    public PictureDTO(Picture pic) throws Exception {
        if (pic == null) {
            throw new Exception();
        }
        this.name = pic.getName();
        this.author = pic.getAuthor();
        this.date = pic.getDate();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }
    public String getData(){
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy"); 
        return "Name: "+name+", Author: "+author+", Date: "+dt.format(date);
    }
}
