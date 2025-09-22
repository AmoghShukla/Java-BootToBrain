// Demonstration of Interfaces in Java
// This program defines three interfaces and a class that implements all of them.
// The class provides concrete implementations for the methods declared in the interfaces.

package Interface;

interface I1{
    void f1();
}
interface I2{
    void f2();
}
interface I3{
    void f3();
}
class A implements I1, I2, I3{
    public void f1(){
        System.out.println("f1 method");
    }
    public void f2(){
        System.out.println("f2 method");
    }
    public void f3(){
        System.out.println("f3 method");
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
        a.f2();
        a.f3();
    }
}
