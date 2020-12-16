package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeCollector = new ArrayList<>();

    public ShapeCollector(List<Shape> shapeCollector) {
        this.shapeCollector = shapeCollector;
    }

    public void addFigure(Shape shape) {
        //adding shape
    }

    public void removeFigure(Shape shape) {
        //deleting shape
    }

    public Shape getFigure(int n) {
        return null;
    }

    public void ShowFigures() {
        //show all figures
    }
}
