package enumeration.ex1and4;

public class Test {

    public static void main(String[] args) {
        Planets planet = Planets.MERCURY;
        System.out.println(planet.toString());
        System.out.println(planet.distanceFromSun());
        Planets planet1 = Planets.EARTH;
        System.out.println(planet1.toString());
    }

}
