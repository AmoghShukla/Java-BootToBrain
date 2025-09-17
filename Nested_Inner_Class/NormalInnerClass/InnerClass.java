package Nested_Inner_Class.NormalInnerClass;

class Outer{
    int data = 10; // instance variable
    class Inner{
        void msg(){
            System.out.println("data is " + data);
        }
    }
    void display(){
        Inner in = new Inner();
        in.msg();
    }
}

public class InnerClass {
    public static void main(String[] args){
        Outer out = new Outer();
        out.display();
    }
    
}
