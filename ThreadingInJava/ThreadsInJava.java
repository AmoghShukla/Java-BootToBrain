package ThreadingInJava;
import java.lang.Runnable;

public class ThreadsInJava {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
