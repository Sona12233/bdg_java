package org.example.design_patterns.visitor;

public class TaxVisitorHoliday implements Visitor{

    public TaxVisitorHoliday(){
    }

    @Override
    public double visit(Beverage beverageItem) {
        System.out.println("Beverage item: Price with Tax");
        return beverageItem.getPrice() * 0.10 + beverageItem.getPrice();
    }

    @Override
    public double visit(Tobacco tobaccoItem) {
        System.out.println("Tobacco item: Price with Tax");
        return tobaccoItem.getPrice() * 0.30 + tobaccoItem.getPrice();
    }

    @Override
    public double visit(Food foodItem) {
        System.out.println("Food item: Price with Tax");
        return foodItem.getPrice() * 0 + foodItem.getPrice();
    }
}
