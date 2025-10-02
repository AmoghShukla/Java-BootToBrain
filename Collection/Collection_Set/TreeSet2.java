package Collection.Collection_Set;
import java.util.*;

public class TreeSet2 {
    public static void main(String [] args){
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        System.out.println(ts);

        System.out.println("Head Set: " + ts.headSet("C")); // Elements less than C
        System.out.println("Tail Set: " + ts.tailSet("C")); // Elements greater than or equal to C
        System.out.println("Sub Set: " + ts.subSet("B", "D")); // Elements from B (inclusive) to D (exclusive)
    }
    
}
