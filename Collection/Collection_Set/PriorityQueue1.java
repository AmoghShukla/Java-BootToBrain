package Collection.Collection_Set;
import java.util.*;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("Amogh1");
        pq.offer("Amogh2");
        pq.offer("Amogh3");
        pq.offer("Amogh4");
        pq.offer("Amogh5");
        pq.offer("Amogh6");
        System.out.println(pq);

        // Parameterised Constructor
        PriorityQueue pq2 = new PriorityQueue(5);
        pq2.offer("Shukla1");
        pq2.offer("Shukla2");
        pq2.offer("Shukla3");
        pq2.offer("Shukla4");
        pq2.offer("Shukla5");
        System.out.println(pq2);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        
    }
    
}