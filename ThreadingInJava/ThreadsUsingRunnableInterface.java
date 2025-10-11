package ThreadingInJava;
import java.util.*;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread A :" + i);
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread B :" + i);
        }
    }
}

public class ThreadsUsingRunnableInterface {
    public static void main(String[] args) {
        Thread T1 = new Thread(new A());
        Thread T2 = new Thread(new B());
        T1.start();
        T2.start();
    }
}


// Threads using runnable Interface