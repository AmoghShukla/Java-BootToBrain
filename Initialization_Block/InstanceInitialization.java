// Demonstration of Instance Initialization Block in Java
// Instance Initialization blocks are used to initialize instance variables.
// They run every time an instance of the class is created, before the constructor.

package Initialization_Block;

public class InstanceInitialization {
    int k;
    {
        System.out.println("Instance Initialization Block : k=" + k);
        k = 5;
    }
    InstanceInitialization(){
        System.out.println("Constructor : k=" + k);
    }

    public static void main(String []args){
        InstanceInitialization I1 = new InstanceInitialization();
        InstanceInitialization I2 = new InstanceInitialization();
    }
    
}
