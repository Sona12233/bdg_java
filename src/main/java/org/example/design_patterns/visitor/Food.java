package org.example.design_patterns.visitor;

public class Food implements Visitable{
    private double price;

    Food(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
