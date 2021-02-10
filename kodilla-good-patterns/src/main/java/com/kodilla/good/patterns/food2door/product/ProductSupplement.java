package com.kodilla.good.patterns.food2door.product;

public class ProductSupplement extends Product {
    private int medicalClass;

    public ProductSupplement(String productName, int medicalClass) {
        super(productName);
        this.medicalClass = medicalClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductSupplement that = (ProductSupplement) o;

        return medicalClass == that.medicalClass;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + medicalClass;
        return result;
    }
}
