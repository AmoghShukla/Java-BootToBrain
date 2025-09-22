// Demonstration of Static Initialization Block in Java
// Static Initialization blocks are used to initialize static variables.
// They run once when the class is loaded, before any constructor or instance initialization block.

package Initialization_Block;

public class StaticInitialization {
    static int k;
    static {
        System.out.println("Static Initialization Block : k=" + k);
        k = 10;
    }
    StaticInitialization(){
        System.out.println("Constructor : k=" + k);
    }

    public static void main(String []args){
        StaticInitialization I1 = new StaticInitialization();
        StaticInitialization I2 = new StaticInitialization();
    }

}
