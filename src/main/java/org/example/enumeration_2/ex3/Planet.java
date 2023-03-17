package org.example.enumeration_2.ex3;

public enum Planet {
    MERCURY("Mercury", 0.330, 57.9 ),
    VENUS("Venus", 4.87, 108.2),
    EARTH("Earth", 5.97, 149.6),
    MARS("Mars", 0.642, 228.0),
    JUPITER("Jupiter", 1898, 778.5),
    SATURN("Saturn", 568, 1432.0),
    URANUS("Uranus", 86.8, 2867.0),
    NEPTUNE("Neptune", 102, 4515.0);
    private String name;
    private double mass;
    private double distanceFromSun;

    Planet(String name, double mass, double distanceFromSun) {
        this.name = name;
        this.mass = mass;
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public String toString() {
        return "The name: " + name + '\n' +
                "The mass: " + mass + " x10^24 kg" + "\n" +
                "The distance from sun: " + distanceFromSun
                + " x 10^6 km"
                ;
    }
}
