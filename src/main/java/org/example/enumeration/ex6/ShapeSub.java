package org.example.enumeration.ex6;

import static org.example.enumeration.ex6.ShapeType.*;

public class ShapeSub extends Shape {
    public double length;
    public double width;
    public double side;
    public double radius;

    @Override
    public void setSides(ShapeType type, double... sides) {
        if (type == CIRCLE) this.radius = sides[0];
        if (type == SQUARE) this.side = sides[0];
        if (type == RECTANGLE) {
            this.length = sides[0];
            this.width = sides[1];
        }
    }

    @Override
    public double getArea(ShapeType type) {
        double area = 0;
        if (type == CIRCLE)
            area = Math.PI * Math.pow(radius, 2);
        if (type == SQUARE)
            area = Math.pow(side, 2);
        if (type == RECTANGLE)
            area = length * width;
        return area;
    }

    @Override
    public double getPerimeter(ShapeType type) {
        double permimeter = 0;
        if (type == CIRCLE)
            permimeter = Math.PI * 2 * radius;
        if (type == SQUARE)
            permimeter = 4 * side;
        if (type == RECTANGLE)
            permimeter = 2 * width + 2 * length;
        return permimeter;
    }
}
