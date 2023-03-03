package abstact_class_and_interface.ex5;

public class Base {
    static boolean b = true;

    public void enable() {
        if (b) System.out.println("Hello parent");
        else System.out.println("Happy new year");
    }

    public void disable() {
        Base.b = !b;
    }

}
