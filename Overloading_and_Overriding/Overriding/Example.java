package Overloading_and_Overriding.Overriding;

class A{
    public void f1(int x){
        System.out.println("Class A");
    }
}

class B extends A{
    public void f1(int x){ // Method Being Overridden
        System.out.println("Class B");
    }
}

public class Example {
    public static void main(String []args){
        B obj = new B();
        obj.f1(5); // When one argument is passed the method from class B is called
        obj.f1(10); // When two arguments are passed the method from class B is called
    }
}
