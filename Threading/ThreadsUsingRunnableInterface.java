package Threading;
import java.util.*;

class A implements Runnable{
    public void run(){
        int i;
        for(int i = 0; i<10;i++){
            System.out.println("Thread A :" + i);
        }
    }

}

class B implements Runnable{

}

public class ThreadsUsingRunnableInterface {
    
}
