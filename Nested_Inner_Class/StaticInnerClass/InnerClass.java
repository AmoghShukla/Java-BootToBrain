package Nested_Inner_Class.StaticInnerClass;
class Outer{
    static class Inner{
        void display(){
            System.out.println("Inside Inner method");
        }

    }
}


public class InnerClass {
    public static void main(String[] args){
        Outer.Inner o1 = new Outer.Inner();
        o1.display();
    }
    


    
}
