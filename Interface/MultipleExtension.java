package Interface;

interface I1{
    int x1 = 10;
    void m1();
}
interface I2{
    int x2 = 20;
    void m2();
}
interface I3 extends I1, I2{
    int x3 = 30;
    void m3();
}
class A{
    void display(){
        System.out.println("x1: "+I1.x1);
        System.out.println("x2: "+I2.x2);
        System.out.println("x3: "+I3.x3);
    }
}
class B extends A implements I3{
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
    public void m3(){
        System.out.println("m3 method");
    }
    void show(){
        m1();
        m2();
        m3();
    }
}

public class MultipleExtension {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.show();
    }
    
}
