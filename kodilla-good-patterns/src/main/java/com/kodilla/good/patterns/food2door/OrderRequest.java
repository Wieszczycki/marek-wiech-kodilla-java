package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.provider.ProviderService;

import java.util.Map;

public class OrderRequest {

    private Product product;
    private int amount;

    public OrderRequest(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
