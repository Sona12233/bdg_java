package abstact_class_and_interface.ex7;

public class B extends Marks{

    @Override
    int getPercentage() {
        int total = object1 + object2 + object3 + object4;
        return total/4;
    }

    private int object1;
    private int object2;
    private int object3;
    private int object4;

    public int getObject1() {
        return object1;
    }

    public void setObject1(int object1) {
        if (object1 >= 0 && object1 <= 100)
        this.object1 = object1;
    }

    public int getObject2() {
        return object2;
    }

    public void setObject2(int object2) {
        if (object2 >= 0 && object2 <= 100)
        this.object2 = object2;
    }

    public int getObject3() {
        return object3;
    }

    public void setObject3(int object3) {
        if (object3 >= 0 && object3 <= 100)
        this.object3 = object3;
    }

    public int getObject4() {
        return object4;
    }

    public void setObject4(int object4) {
        if (object4 >= 0 && object4 <= 100)
        this.object4 = object4;
    }

    public B(int object1, int object2, int object3, int object4) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.object4 = object4;
    }
}
