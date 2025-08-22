final class Example1{
}

class Example2{
    final void func(){
        System.out.println("Final method in Example2");
    }
}

class Example3 extends Example2{
    // void func(){ // This will give error as final method cannot be overridden
    //     System.out.println("Final method in Example3");
    // }
}

public class final_keyword {
    private final int value; // final instance member variable
    private static final int y; // final static member variable
    static {
        y = 20; // static final variable must be initialized in static block
    }
    final_keyword(){
        value = 5;
    }
    public void function(){
        final int k = 7; // final local variable
    }
    public static void main(){
        final_keyword f1 = new final_keyword();

    }
}

