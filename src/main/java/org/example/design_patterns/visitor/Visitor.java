package org.example.design_patterns.visitor;

public interface Visitor {

    double visit(Beverage beverageItem);
    double visit(Tobacco tobaccoItem);
    double visit(Food foodItem);

}
