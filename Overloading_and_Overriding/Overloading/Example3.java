package Overloading_and_Overriding.Overloading;

class A{
    public void f1(int x){
        System.out.println("Class A");
    }

    public void f1(int x, int y){ // Method Being Overridden
        System.out.println("Class A -- 2");
    }
}

class B extends A{
    
}

public class Example3 {
    public static void main(String []args){
        B obj = new B();
        obj.f1(5); // When one argument is passed the method from class A is called
        obj.f1(5, 10); // When two arguments are passed the method from class A --2  is called
    }
}