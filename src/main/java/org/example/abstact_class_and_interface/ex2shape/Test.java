package org.example.abstact_class_and_interface.ex2shape;

public class Test {
    public static void main(String[] args) {
        Circle objCircle = new Circle();
        Triangle objTriangle = new Triangle();
        Square objSquare = new Square();
        objCircle.draw();
        objCircle.erase();
        objTriangle.draw();
        objTriangle.erase();
        objSquare.draw();
        objSquare.erase();
    }



}
