package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderRequest {
    private User user;
    private Product product;
    private int amount;
    private LocalDateTime orderDate;

    public ProductOrderRequest(User user, Product product, int amount, LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
