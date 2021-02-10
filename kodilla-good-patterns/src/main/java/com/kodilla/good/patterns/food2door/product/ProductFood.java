package com.kodilla.good.patterns.food2door.product;

public class ProductFood extends Product {
    private boolean vegetarian;

    public ProductFood(String productName, boolean vegetarian) {
        super(productName);
        this.vegetarian = vegetarian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductFood that = (ProductFood) o;

        return vegetarian == that.vegetarian;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (vegetarian ? 1 : 0);
        return result;
    }
}
