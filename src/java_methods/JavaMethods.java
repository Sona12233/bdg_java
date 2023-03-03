package java_methods;

public class JavaMethods {
    /**
     * @param a
     * @param b
     * @return 0
     */
    public int myMethod1(int a, int b){
        return 0;
    }

    /**
     * This method has no parameters and returns nothing
     */
    public void myMethod2(){

    }

    /**
     * This method has boolean parameters and prints "Hello world"
     * @param a
     * @param b
     */
    public void myMethod3(boolean a, boolean b){
        System.out.println("Hello world");
    }

    /**
     * This method has a char parameter and returns it
     * @param a
     * @return a
     */
    public char myMethod4(char a){
        return a;
    }

    /**
     * This method has two float parameters and returs one of them
     * @param a
     * @param b
     * @return a
     */
    public float myMethod5(float a, float b){
        return a;
    }

    public int count = 0;

    /**
     * A recursion method that implements count and prints it
     */
    public void myMethod6(){
        count++;
        if(count < 3){
            System.out.println(count);
            myMethod6();
        }
    }

    public static void main(String[] args) {
        JavaMethods m = new JavaMethods();
        m.myMethod6();
    }
}
