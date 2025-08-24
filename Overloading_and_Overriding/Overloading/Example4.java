package Overloading_and_Overriding.Overloading;

class X{
    public void f1(int x){
        System.out.println("Class A");
    }
}

class Y extends X{
    public void f1(int x, int y){ // Method Being Overridden
        System.out.println("Class Y");
    }
}

public class Example4 {
    public static void main(String []args){
        Y obj = new Y();
        obj.f1(5); // When one argument is passed the method from class X is called
        obj.f1(5, 10); // When two arguments are passed the method from class Y is called
    }
}