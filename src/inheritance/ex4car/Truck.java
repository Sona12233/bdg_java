package inheritance.ex4car;

public class Truck extends Car {

    private int capacity;

    public Truck(int passengerCount, char engineType){
        super.setPassengerCount(passengerCount);
        super.setEngineType(engineType);
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}
