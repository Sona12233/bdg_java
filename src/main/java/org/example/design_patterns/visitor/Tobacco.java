package org.example.design_patterns.visitor;

public class Tobacco implements Visitable{

    private double price;

    Tobacco(double price){
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
