package com.oracle.team.domain;

public class NoteBook implements Equipment {
    private String model;
    private double price;

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String  getDescription() {
        return model + price;
    }

    @Override
    public String toString() {
        return model + "(" + price + ")";
    }
}
