package enumeration_2.ex1;

public enum LightStates {
    RED("red", 2500),
    YELLOW("yellow", 5000),
    GREEN("green", 3000);

    private String name;
    private int second;

    LightStates(String name, int second) {
        this.name = name;
        this.second = second;
    }

    public String getName() {
        return name;
    }

    public int getSecond() {
        return second;
    }
}
