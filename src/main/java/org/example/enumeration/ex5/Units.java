package org.example.enumeration.ex5;

public enum Units {
    METER {
        @Override
        public Units getBaseUnit() {
            return METER;
        }
    },
    KILOGRAM {
        @Override
        public Units getBaseUnit() {
            return KILOGRAM;
        }
    },


    SECOND {
        @Override
        public Units getBaseUnit() {
            return SECOND;
        }
    }, AMPERE{
        @Override
        public Units getBaseUnit() {
            return AMPERE;
        }
    },
    KELVIN{
        @Override
        public Units getBaseUnit() {
            return KELVIN;
        }
    },
    MOLE{
        @Override
        public Units getBaseUnit() {
            return MOLE;
        }
    },
    CANDELA{
        @Override
        public Units getBaseUnit() {
            return CANDELA;
        }
    };


    public abstract Units getBaseUnit();
}
