// Constructor in Java are used to initialize an Object

public class Constructor {
    private int l, b, h;
    // Constructor 1 or Default Constructor with no parameters
    public Constructor(){
        l = 10;
        b = 12;
        h = 22;
    }

    // Constructor 2 or Parameterized Constructor with parameters
    // This is also called Constructor Overloading
    public Constructor(int L, int B, int H) {
        this.l = L;
        this.b = B;
        this.h = H;

    }

    public int[] getValues(){
        return new int[]{l, b, h};
    }
    
    public static void main(String []args){
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(5, 10, 15);
    
        System.out.println("Default Constructor Values: " + java.util.Arrays.toString(c1.getValues()));
        System.out.println("Parameterized Constructor Values: " + java.util.Arrays.toString(c2.getValues()));
    }
};
