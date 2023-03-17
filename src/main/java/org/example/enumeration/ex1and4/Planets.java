package org.example.enumeration.ex1and4;

public enum Planets {
    MERCURY("mercuri", 88) {
        @Override
        public String distanceFromSun() {
            return "65 million km";
        }
    },
    VENUS("venus", 225){
        @Override
        public String distanceFromSun() {
            return "108 million km";
        }
    },
    EARTH("earth", 365){
        @Override
        public String distanceFromSun() {
            return "148 million km";
        }
    },
    MARS("mars", 687){
        @Override
        public String distanceFromSun() {
            return "244 million km";
        }
    },
    JUPITER("jupiter", 4333){
        @Override
        public String distanceFromSun() {
            return "740 million km";
        }
    },
    SATURN("saturn", 10759){
        @Override
        public String distanceFromSun() {
            return "1.4 billion km";
        }
    },
    URANUS("uranus", 30687){
        @Override
        public String distanceFromSun() {
            return "2.9 billion km";
        }
    },
    NEPTUNE("neptune", 60200){
        @Override
        public String distanceFromSun() {
            return "4.4 billion km";
        }
    };
    private String name;
    private int yearLength;


    private Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;

    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }


    @Override
    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", yearLength=" + yearLength + '\'' + '}';
    }

    /**
     * This method returns the distance from the sun
     * @return
     */
    public abstract String distanceFromSun();
    }

