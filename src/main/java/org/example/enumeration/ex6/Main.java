package org.example.enumeration.ex6;

public class Main {
    public static void main(String[] args) {
        ShapeSub shape = new ShapeSub();
        shape.setSides(ShapeType.valueOf("CIRCLE"), 6);
        System.out.println(shape.getPerimeter(ShapeType.valueOf("CIRCLE")));
    }
}
