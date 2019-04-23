package com.oracle.team.domain;

public class Printer implements Equipment {
    private String type;
    private String name;

    public Printer(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getDescription() {
        return type + name;
    }

    @Override
    public String toString() {
        return name + "(" + type + ")";
    }
}
