package ThreadingInJava;
import java.util.*;

class A extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A :" + i);
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B :" + i);
        }
    }
}

public class ExtendThreadClass {
    public static void main(String[] args) {
        A threadA = new A();
        B threadB = new B();
        threadA.start();
        threadB.start();
    }
}
