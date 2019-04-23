package com.oracle.team.domain;

public class PC implements Equipment {
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }
    
    public String  getDescription() {
        return model + display;
    }

    @Override
    public String toString() {
        return model + "(" + display + ")";
    }
}
