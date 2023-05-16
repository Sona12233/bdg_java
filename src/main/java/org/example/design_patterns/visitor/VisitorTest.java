package org.example.design_patterns.visitor;

public class VisitorTest {
    public static void main(String[] args) {

        TaxVisitor taxVisitor = new TaxVisitor();
        TaxVisitorHoliday taxVisitorHoliday = new TaxVisitorHoliday();

        Food milk = new Food(3.47);
        Beverage beer = new Beverage(6.3);
        Tobacco cigars = new Tobacco(30.23);

        System.out.println(milk.accept(taxVisitor));
        System.out.println(beer.accept(taxVisitor));
        System.out.println(cigars.accept(taxVisitor) + "\n");

        System.out.println("Prices on holidays!!!");
        System.out.println(milk.accept(taxVisitorHoliday));
        System.out.println(beer.accept(taxVisitorHoliday));
        System.out.println(cigars.accept(taxVisitorHoliday));


    }
}
