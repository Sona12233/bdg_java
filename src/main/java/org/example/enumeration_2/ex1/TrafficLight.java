package org.example.enumeration_2.ex1;


import java.util.Scanner;

public class TrafficLight extends LightService {
    private LightStates state = LightStates.RED;

    void changing(LightStates state) throws InterruptedException{
        while (true){
            System.out.println(state);
            Thread.sleep(state.getSecond());
            state = changeStates(state);
        }
    }

    /**
     * This method changes the states of traffic light
     *
     * @return
     */
    @Override
    public LightStates changeStates(LightStates state) {
        switch (state) {
            case RED -> {
                return  LightStates.GREEN;
            }
            case GREEN -> {
                return LightStates.YELLOW;
            }

        }
        return LightStates.RED;
    }

    /**
     * This method returns the state to string
     *
     * @return
     */
    @Override
    public String toString() {
        return "The traffic light is " + state;
    }

    public static void main(String[] args) throws InterruptedException {
        TrafficLight tr = new TrafficLight();
        Scanner sc = new Scanner(System.in);
        System.out.println("Red - 1");
        System.out.println("Yellow - 2");
        System.out.println("Green - 3");
        int start = sc.nextInt();
        switch (start){
            case 1: tr.changing(LightStates.RED); break;
            case 2: tr.changing(LightStates.YELLOW); break;
            case 3: tr.changing(LightStates.GREEN); break;
            default:
                System.out.println("Wrong input");
        }

    }
}
