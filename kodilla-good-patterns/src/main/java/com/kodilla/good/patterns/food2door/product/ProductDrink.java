package com.kodilla.good.patterns.food2door.product;

public class ProductDrink extends Product {
    private boolean alcohol;

    public ProductDrink(String productName, boolean alcohol) {
        super(productName);
        this.alcohol = alcohol;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductDrink that = (ProductDrink) o;

        return alcohol == that.alcohol;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (alcohol ? 1 : 0);
        return result;
    }
}
