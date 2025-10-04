package Collection.Collection_Set;
import java.util.*;


public class SortedSet1 {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Mango");
        sortedSet.add("Orange");
        // Displaying the SortedSet
        System.out.println("Sorted Set: " + sortedSet);
        System.out.println("First Element: " + sortedSet.first());
        System.out.println("Last Element: " + sortedSet.last());
        System.out.println("Head Set (up to Mango): " + sortedSet.headSet("Mango"));
        System.out.println("Tail Set (from Mango): " + sortedSet.tailSet("Mango"));
        System.out.println("Sub Set (from Apple to Orange): " + sortedSet.subSet("Apple", "Orange"));
        System.out.println("Size of Sorted Set: " + sortedSet.size());
    }
}
