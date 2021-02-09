package com.kodilla.good.patterns.srp;

public class ProductAnimal implements Product {
    private String productName;
    private double productPrice;

    public ProductAnimal(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String getName() {
        return productName;
    }

    @Override
    public double getPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Zwierzaczek='" + productName + '\'' +
                ", Cena=" + productPrice +
                '}';
    }
}
