package org.example.inheritance.ex4car;

public class Car {
    private int passengerCount;
    private char engineType;

    public void setPassengerCount(int passengerCount){
        if (passengerCount >= 2){
            this.passengerCount = passengerCount;
        }
    }

    public int getPassengerCount(){
        return passengerCount;
    }

    public void setEngineType(char engineType){
        if (Character.isAlphabetic(engineType)){
            this.engineType = engineType;
        }
    }

    public char getEngineType(){
        return engineType;
    }


}
