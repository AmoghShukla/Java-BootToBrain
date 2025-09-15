// Constructor in Inheritance
// When a subclass object is created, the superclass constructor is called first to initialize the inherited attributes.
// If the superclass constructor is not explicitly called, the default (no-argument) constructor of

package Inheritance;

class A{
    int a ;
    public A(){
        System.out.println("In A's constructor");
        a = 10;
    }
}
class B extends A{
    int b;
    public B(){
        // super(); // Implicit call to superclass constructor
        System.out.println("In B's constructor");
        b = 20;
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("a: " + obj.a); // Accessing inherited member
        System.out.println("b: " + obj.b); // Accessing own member
    }
}