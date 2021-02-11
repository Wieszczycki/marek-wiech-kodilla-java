package com.kodilla.good.patterns.food2door;

public class Product {
    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    private int id;
    private String productName;

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                " ,productName='" + productName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + id;
        return result;
    }
}
