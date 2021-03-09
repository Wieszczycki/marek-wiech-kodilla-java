package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {
    SALAD("sałata"),
    ONION("cebula"),
    BACON("bekon"),
    PICKLE("ogórek"),
    CHILLI("chilli"),
    MUSHROOMS("pieczarki"),
    SHRIMPS("krewetki"),
    CHEESE("ser");

    private String name;

    Ingredient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
