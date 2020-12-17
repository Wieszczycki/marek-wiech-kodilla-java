package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private double field;

    public Circle(String shapeName, Double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    public String getShapeName() {
        //todo
        return shapeName;
    }

    public double getField() {
        //todo
        return field;
    }
}
