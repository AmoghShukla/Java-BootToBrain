package Collection.Collection_Set;
import java.util.*;


public class SortedSet1 {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Mango");
        sortedSet.add("Orange");

        System.out.println("Sorted Set: " + sortedSet);
        System.out.println("First Element: " + sortedSet.first());
    }
}
