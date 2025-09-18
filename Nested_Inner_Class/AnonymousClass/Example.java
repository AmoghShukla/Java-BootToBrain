package Nested_Inner_Class.AnonymousClass;

class Greeting{
    void greet(){
        System.out.println("Hello, World!");
    }
}
class Farewell{
    Greeting g = new Greeting(){ // Anonymous class extending Greeting
        @Override
        void greet(){
            System.out.println("Hi there, Universe!");
        }
    };
    void sayFarewell(){
        g.greet();
    }
}

public class Example {
    public static void main(String[] args) {
        Farewell farewell = new Farewell();
        farewell.sayFarewell();
    }
}
