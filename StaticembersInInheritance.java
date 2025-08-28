class Parent{
    public static void f1(){
        System.out.println("Parent class static block");
    }
}

class Child extends Parent{
    public static void f1(){
        System.out.println("Child class static block");
    }
}

public class StaticembersInInheritance {
    public static void main(String[] args) {
        Child.f1(); // Calls Child's f1
    }
    
}
