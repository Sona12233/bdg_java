package org.example.enumeration.ex3;

public enum Shapes {
    SQUARE {
        private double side;

        @Override
        public double area() {
            return Math.pow(side, 2);
        }

        @Override
        public void setSides(double... sides) {
            if (sides[0] < 0) System.out.println("Side of a square must be a positive number");
            if (sides.length != 1) System.out.println("It must be only one side since all sides of a square are equal");
            this.side = sides[0];
        }
    },

    TRIANGLE {
        private double side1;
        private double side2;
        private double side3;

        @Override
        public double area() {
            double p = side1 + side2 + side3; //perimeter of triangle
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }

        @Override
        public void setSides(double... sides) {
            if (sides[0] < 0 || sides[1] < 0 || sides[2] < 0) System.out.println("Sides must be positive");
            if (sides.length!=3) System.out.println("Triangle must have only 3 sides" );
            this.side1=sides[0];
            this.side2=sides[1];
            this.side3=sides[2];

        }
    };

    /**
     * This abstract method calculates the area of the specified shape
     *
     * @return
     */
    public abstract double area();

    /**
     * This abstract method sets side or sides for specified shape
     *
     * @param sides
     */
    public abstract void setSides(double... sides);

    }
