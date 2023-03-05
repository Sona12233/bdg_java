package enumeration_2.ex1;


import static enumeration_2.ex1.LightStates.*;

public class TrafficLight extends LightService {
    private LightStates state = RED;

    /**
     * This method changes the states of traffic light
     *
     * @return
     */
    @Override
    public LightStates changeStates() {
        switch (state) {
            case RED -> state = GREEN;
            case GREEN -> state = YELLOW;
            case YELLOW -> state = RED;
        }
        return state;
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

    public static void main(String[] args) {
        TrafficLight obj = new TrafficLight();
        obj.changeStates();
        System.out.println(obj.toString());

    }
}
