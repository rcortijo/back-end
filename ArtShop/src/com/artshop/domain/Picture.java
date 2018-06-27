package com.artshop.domain;

import java.util.Date;

public class Picture {

    String name;
    String author;
    Date date;

    public Picture(String name, String author) throws Exception {
        if (name == null || name.equals("")) {
            throw new Exception();
        }
        if (author == null || author.equals("")) {
            throw new Exception();
        }
        this.name = name;
        this.author = author;
        this.date = new Date();
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

}
