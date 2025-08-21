package Overloading_and_Overriding.Overloading;

class A{
    
}

class B extends A{
    public void f1(int x){
        System.out.println("Class B - 1");
    }

    public void f1(int x, int y){ // Method Being Overloaded
        System.out.println("Class B - 2");
    }
}

public class Example2 {
    public static void main(String []args){
        B obj = new B();
        obj.f1(5); // When one argument is passed the method from class A is called
        obj.f1(5, 10); // When two arguments are passed the method from class B is called
    }
}
