// Constructor Chaining means calling one constructor from another constructor with respect to current object.
// It is used to initialize an object with different ways.
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
        this(4);
        System.out.println("In B's constructor");
    }
    public B(int value){
        System.out.println("In B's parameterized constructor");
        b = value;
    }
}

public class ConstructorChainning {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B(10);
    }

}
