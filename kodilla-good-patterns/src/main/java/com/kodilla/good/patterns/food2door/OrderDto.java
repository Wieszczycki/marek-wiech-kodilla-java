package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.provider.ProviderService;

public class OrderDto {
    private int amount;
    private Product product;
    private boolean isAvailable;

    public OrderDto(int amount, Product product, boolean isAvailable) {
        this.amount = amount;
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public int getAmount() {
        return amount;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
