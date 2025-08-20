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
