package org.example.abstact_class_and_interface.ex6;

public class MbtaVehicles {
    private Types type;

    private Kinds kind;

    public MbtaVehicles(Types type, Kinds kind){
        this.type = type;
        this.kind = kind;
    }

    public static void main(String[] args) {
        MbtaVehicles obj = new MbtaVehicles(Types.BUS, Kinds.MIXED);

    }

}
