package Collection.List;
import java.util.*;

public class LinkedList1 {
    public static void main(String[] args){
        LinkedList L1 = new LinkedList();
        L1.addFirst("Amogh");
        L1.addLast("Shukla");
        L1.add(1, "Rajesh");
        System.out.println(L1.getFirst());
        System.out.println(L1.get(1));
        
        System.out.println(L1.indexOf("Rajesh"));
        System.out.println(L1.getLast());
    }
    
}
