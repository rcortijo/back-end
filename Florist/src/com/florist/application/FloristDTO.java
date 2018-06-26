package com.florist.application;

import com.florist.domain.Florist;

public class FloristDTO {
    private String name;
    public FloristDTO(Florist florist){
        this.name=florist.getName();
    }

    public String getName() {
        return name;
    }
    
}
