package org.example.design_patterns.visitor;

public class Beverage implements Visitable{

    private double price;

    Beverage(double price){
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
