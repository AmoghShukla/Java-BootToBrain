// Super Keyword in Java is used to refer to the immediate parent class object.
// It can be used to call parent class methods, and to access parent class constructors.

class A{
    public void f1(){
        System.out.println("Class A");
    }
}

class B extends A{
    public void f1(){
        System.out.println("Class B");
    }
    public void f2(){
        super.f1(); // calling parent class method using super keyword
        System.out.println("Class B f2 method");
    }
}

public class super_keyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.f1();
        obj.f2();
    }
}
