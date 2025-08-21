package Overloading_and_Overriding;

class A{
    public void f1(int x){
        System.out.println("Class A");
    }
}

class B extends A{
    public void f1(int x, int y){ // Method Being Overridden
        System.out.println("Class B");
    }
}

public class Example1 {
    public static void main(String []args){
        B obj = new B();
        obj.f1(5); // When one argument is passed the method from class A is called
        obj.f1(5, 10); // When two arguments are passed the method from class B is called
    }
}
