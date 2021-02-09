package com.kodilla.good.patterns.srp;

import java.time.LocalDateTime;

public class ProductOrderDto {
    public User user;
    public Product product;
    public int amount;
    public LocalDateTime orderDate;
    public boolean isSold;

    public ProductOrderDto(User user, Product product, int amount, LocalDateTime orderDate, boolean isSold) {
        this.user = user;
        this.product = product;
        this.amount = amount;
        this.orderDate = orderDate;
        this.isSold = isSold;
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

    public boolean isSold() {
        return isSold;
    }
}
