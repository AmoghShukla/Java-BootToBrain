package Abstract;

abstract class A{
    abstract void f1();
}

abstract class B extends A{
    public void f1(){
        System.out.println("In B's f1");
    }
}

class C extends B {
    public void f1(){
        System.out.println("In C's f1");
    }
}

public class AbstractMethod {
    public static void main(String[] args){
        A o1 = new C(); // Instantiate the concrete subclass
        o1.f1(); // Calls C's f1
    }
}
