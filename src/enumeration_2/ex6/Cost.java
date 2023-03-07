package enumeration_2.ex6;

public class Cost {
    private Pizza pizza;
    private double cost;

    public Cost(Pizza pizza) {
        this.pizza = pizza;
    }
    private void count(){
        this.cost = 0;
        cost += this.pizza.getPizzaSize().getPrice();
        cost += this.pizza.getTopping().getPrice();
    }

    public double getCost() {
        return cost;
    }
}
