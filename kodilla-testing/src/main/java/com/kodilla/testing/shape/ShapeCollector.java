package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollector = new ArrayList<>();

    public ShapeCollector(){}

    public void addFigure(Shape shape) {
        //TODO adding shape
        this.shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        //TODO deleting shape
        return true;
    }

    public Shape getFigure(int n) {
        //TODO return shape
        return null;
    }

    public String ShowFigures() {
        //TODO show all figures in 1 String
        return "test";
    }

    public int getFiguresQuantity() {
        //TODO get current array size
        return 100;
    }
}
