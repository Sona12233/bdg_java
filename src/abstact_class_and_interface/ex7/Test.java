package abstact_class_and_interface.ex7;

public class Test {

    public static void main(String[] args) {
        A objA = new A(20,60,85);
        B objB = new B(60,8,81,36);
        System.out.println(objA.getPercentage());
        System.out.println(objB.getPercentage());
    }

}
