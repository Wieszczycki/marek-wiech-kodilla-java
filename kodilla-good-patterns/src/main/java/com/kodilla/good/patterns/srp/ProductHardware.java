package com.kodilla.good.patterns.srp;

public class ProductHardware implements Product{
    private String productName;
    private double productPrice;

    public ProductHardware(String productName, double productPrice) {
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
        return "Sprzęt='" + productName + '\'' +
                ", Cena=" + productPrice +
                '}';
    }

}
