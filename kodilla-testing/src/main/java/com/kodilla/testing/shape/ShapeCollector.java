package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeCollector {

    private List<Shape> shapeCollector = new ArrayList<>();

    public ShapeCollector(){}

    public void addFigure(Shape shape) {
        shapeCollector.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeCollector.contains(shape)) {
            shapeCollector.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapeCollector.size()) {
            return shapeCollector.get((n));
        }
        return null;
    }

    public String ShowFigures() {

        String result = "";

        for (Shape s: shapeCollector) {
            result += s.getShapeName() + ", ";
        }
        result = result.substring(0, result.length() - 2);
        System.out.println(result);

        return result;
    }

    public int getFiguresQuantity() {
        return shapeCollector.size();
    }
}
