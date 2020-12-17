package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String shapeName;
    private double field;

    public Triangle(String shapeName, Double field) {
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
