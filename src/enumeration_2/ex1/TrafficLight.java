package enumeration_2.ex1;


import java.util.Scanner;

import static enumeration_2.ex1.LightStates.*;

public class TrafficLight extends LightService {
    private LightStates state = RED;

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
                return  GREEN;
            }
            case GREEN -> {
                return YELLOW;
            }

        }
        return RED;
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
            case 1: tr.changing(RED); break;
            case 2: tr.changing(YELLOW); break;
            case 3: tr.changing(GREEN); break;
            default:
                System.out.println("Wrong input");
        }

    }
}
