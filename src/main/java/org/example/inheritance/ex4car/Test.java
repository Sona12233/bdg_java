package org.example.inheritance.ex4car;

public class Test {

    public static void main(String[] args) {
        Truck truck = new Truck(3, 'b');
//        truck.setPassengerCount(3);
//        truck.setEngineType('b');
        System.out.println(truck.getPassengerCount() + " "
        + truck.getEngineType() + " " + truck.getCapacity());
    }

}
