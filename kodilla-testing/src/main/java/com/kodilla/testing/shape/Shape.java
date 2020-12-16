package com.kodilla.testing.shape;

public interface Shape {

    String getShapeName();

    double getField();

}

class Circle implements Shape {

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

class Rectangle implements Shape {

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

class Square implements Shape {

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
